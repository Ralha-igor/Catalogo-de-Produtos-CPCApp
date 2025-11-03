package com.example.cpcapp.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.cpcapp.R
import com.example.cpcapp.adapter.PecaAdapter
import com.example.cpcapp.databinding.ActivityMainBinding
import com.example.cpcapp.model.Peca

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupRecyclerView()
    }

    private fun setupRecyclerView() {
        val listaPecas = listOf(
            Peca(
                id = 1,
                nome = "Intel i5 10400F",
                categoria = getString(R.string.processador),
                descricao = getString(R.string.descricao_processador),
                imagem = R.drawable.processador,
                preco = "R$ 799,90"
            )
            ,
            Peca(
                id = 2,
                nome = "ASUS Prime B460M",
                categoria = getString(R.string.placa_mae),
                descricao = getString(R.string.descricao_placa_mae),
                imagem = R.drawable.placa_mae,
                preco = "R$ 699,90"
            ),
            Peca(
                id = 3,
                nome = "Corsair 16GB DDR4",
                categoria = getString(R.string.memoria_ram),
                descricao = getString(R.string.descricao_memoria_ram),
                imagem = R.drawable.memoria_ram,
                preco = "R$ 349,90"
            ),
            Peca(
                id = 4,
                nome = "RTX 3060 12GB",
                categoria = getString(R.string.placa_video),
                descricao = getString(R.string.descricao_placa_video),
                imagem = R.drawable.placa_video,
                preco = "R$ 1.899,90"
            ),
            Peca(
                id = 5,
                nome = "Samsung 1TB NVMe",
                categoria = getString(R.string.ssd),
                descricao = getString(R.string.descricao_ssd),
                imagem = R.drawable.ssd,
                preco = "R$ 499,90"
            ),
            Peca(
                id = 6,
                nome = "Corsair 650W 80 Plus",
                categoria = getString(R.string.fonte),
                descricao = getString(R.string.descricao_fonte),
                imagem = R.drawable.fonte,
                preco = "R$ 459,90"
            ),
            Peca(
                id = 7,
                nome = "Cooler Master MasterBox",
                categoria = getString(R.string.gabinete),
                descricao = getString(R.string.descricao_gabinete),
                imagem = R.drawable.gabinete,
                preco = "R$ 299,90"
            ),
            Peca(
                id = 8,
                nome = "Water Cooler DeepCool",
                categoria = getString(R.string.cooler),
                descricao = getString(R.string.descricao_cooler),
                imagem = R.drawable.cooler,
                preco = "R$ 249,90"
            )
        )

        val adapter = PecaAdapter(listaPecas) { peca ->
            val intent = Intent(this, DetalhesActivity::class.java).apply {
                putExtra("PECA_ID", peca.id)
                putExtra("PECA_NOME", peca.nome)
                putExtra("PECA_CATEGORIA", peca.categoria)
                putExtra("PECA_DESCRICAO", peca.descricao)
                putExtra("PECA_IMAGEM", peca.imagem)
                putExtra("PECA_PRECO", peca.preco)
            }
            startActivity(intent)
        }

        binding.recyclerViewPecas.adapter = adapter
        binding.recyclerViewPecas.layoutManager = LinearLayoutManager(this)
    }
}