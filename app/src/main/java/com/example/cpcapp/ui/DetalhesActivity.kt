package com.example.cpcapp.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.cpcapp.R
import com.example.cpcapp.databinding.ActivityDetalhesBinding

class DetalhesActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetalhesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetalhesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        carregarDadosPeca()
        setupBotaoCompartilhar()
    }

    private fun carregarDadosPeca() {
        val nome = intent.getStringExtra("PECA_NOME") ?: ""
        val categoria = intent.getStringExtra("PECA_CATEGORIA") ?: ""
        val descricao = intent.getStringExtra("PECA_DESCRICAO") ?: ""
        val imagem = intent.getIntExtra("PECA_IMAGEM", R.drawable.processador)
        val preco = intent.getStringExtra("PECA_PRECO") ?: ""

        binding.imgPecaDetalhe.setImageResource(imagem)
        binding.txtNomeDetalhe.text = nome
        binding.txtCategoriaDetalhe.text = categoria
        binding.txtDescricaoDetalhe.text = descricao
        binding.txtPrecoDetalhe.text = preco

        title = getString(R.string.detalhes_peca)
    }

    private fun setupBotaoCompartilhar() {
        binding.btnCompartilhar.setOnClickListener {
            val nome = binding.txtNomeDetalhe.text.toString()
            val preco = binding.txtPrecoDetalhe.text.toString()

            val shareIntent = Intent().apply {
                action = Intent.ACTION_SEND
                putExtra(Intent.EXTRA_TEXT, "Confira esta peça: $nome - $preco")
                type = "text/plain"
            }

            startActivity(Intent.createChooser(shareIntent, getString(R.string.compartilhar)))
        }
    }
}