package com.example.cpcapp.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.core.widget.addTextChangedListener
import androidx.activity.result.contract.ActivityResultContracts
import com.example.cpcapp.adapter.PecaAdapter
import com.example.cpcapp.data.database.AppDatabase
import com.example.cpcapp.model.Peca
import com.example.cpcapp.databinding.ActivityMainBinding
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import androidx.lifecycle.lifecycleScope

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: PecaAdapter


    private val cadastroLauncher = registerForActivityResult(
        ActivityResultContracts.StartActivityForResult()
    ) { result ->
        if (result.resultCode == RESULT_OK) {

            carregarLocais()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        configurarRecyclerView()
        carregarLocais()
        configurarFiltro()
        configurarBotaoCadastro()
    }

    override fun onResume() {
        super.onResume()

        carregarLocais()
    }

    private fun configurarRecyclerView() {
        adapter = PecaAdapter(this) { local ->
            abrirDetalhes(local)
        }

        binding.recyclerLocais.layoutManager = LinearLayoutManager(this)
        binding.recyclerLocais.adapter = adapter
    }

    private fun abrirDetalhes(peca: Peca) {
        val intent = Intent(this, DetalhesActivity::class.java)
        intent.putExtra("PECA", peca)
        startActivity(intent)
    }



    private fun carregarLocais() {
        val dao = AppDatabase.getInstance(this).localDao()

        lifecycleScope.launch(Dispatchers.IO) {
            val lista = dao.listarTodos()

            withContext(Dispatchers.Main) {
                adapter.submitList(lista)
            }
        }
    }

    private fun configurarFiltro() {
        binding.editFiltro.addTextChangedListener { texto ->
            val filtro = texto.toString()

            if (filtro.isEmpty()) {
                carregarLocais()
                return@addTextChangedListener
            }

            val dao = AppDatabase.getInstance(this).localDao()

            lifecycleScope.launch(Dispatchers.IO) {
                val listaFiltrada = dao.buscarPorNome(filtro)

                withContext(Dispatchers.Main) {
                    adapter.submitList(listaFiltrada)
                }
            }
        }
    }

    private fun configurarBotaoCadastro() {
        binding.fabAddLocal.setOnClickListener {
            val intent = Intent(this, CadastroActivity::class.java)
            cadastroLauncher.launch(intent)
        }
    }
}