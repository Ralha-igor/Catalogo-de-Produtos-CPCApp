package com.example.cpcapp.ui

import android.net.Uri
import android.os.Bundle
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.bumptech.glide.Glide
import com.example.cpcapp.data.database.AppDatabase
import com.example.cpcapp.model.Peca
import com.example.cpcapp.databinding.ActivityCadastroBinding
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class CadastroActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCadastroBinding
    private var imagemSelecionadaUri: String? = null

    private val selecionarImagem =
        registerForActivityResult(ActivityResultContracts.OpenDocument()) { uri: Uri? ->
            uri?.let {

                // ✅ AGORA SIM a permissão é permanente
                contentResolver.takePersistableUriPermission(
                    it,
                    android.content.Intent.FLAG_GRANT_READ_URI_PERMISSION
                )

                imagemSelecionadaUri = it.toString()

                Glide.with(this)
                    .load(it)
                    .into(binding.imgPreview)
            }
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCadastroBinding.inflate(layoutInflater)
        setContentView(binding.root)

            binding.btnEscolherImagem.setOnClickListener { selecionarImagem.launch(arrayOf("image/*")) }
        binding.btnSalvar.setOnClickListener { salvarLocal() }
    }

    private fun salvarLocal() {
        val nome = binding.edtNome.text.toString().trim()
        val categoria = binding.edtCategoria.text.toString().trim()
        val descricao = binding.edtDescricao.text.toString().trim()
        val precoTexto = binding.edtPreco.text.toString().trim()
        val preco = precoTexto.toDoubleOrNull()
        val imagemUri = imagemSelecionadaUri


        when {
            nome.isEmpty() -> {
                Toast.makeText(this, "Digite o nome", Toast.LENGTH_SHORT).show()
                return
            }
            categoria.isEmpty() -> {
                Toast.makeText(this, "Digite a categoria", Toast.LENGTH_SHORT).show()
                return
            }
            descricao.isEmpty() -> {
                Toast.makeText(this, "Digite a descrição", Toast.LENGTH_SHORT).show()
                return
            }
            preco == null || preco <= 0 -> {
                Toast.makeText(this, "Digite um preço válido", Toast.LENGTH_SHORT).show()
                return
            }
            imagemUri.isNullOrEmpty() -> {
                Toast.makeText(this, "Escolha uma imagem", Toast.LENGTH_SHORT).show()
                return
            }
        }

        val novoLocal = Peca(
            nome = nome,
            categoria = categoria,
            descricao = descricao,
            preco = preco!!,
            imagemUri = imagemUri!!
        )


        lifecycleScope.launch(Dispatchers.IO) {
            AppDatabase.getInstance(this@CadastroActivity)
                .localDao()
                .inserir(novoLocal)

            withContext(Dispatchers.Main) {
                Toast.makeText(this@CadastroActivity, "Produto cadastrado com sucesso!", Toast.LENGTH_SHORT).show()
                setResult(RESULT_OK)
                finish()
            }
        }
    }
}