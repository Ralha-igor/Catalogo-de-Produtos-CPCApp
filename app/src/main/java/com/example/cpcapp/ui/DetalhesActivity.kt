package com.example.cpcapp.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.example.cpcapp.R
import com.example.cpcapp.databinding.ActivityDetalhesBinding
import com.example.cpcapp.model.Peca

class DetalhesActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetalhesBinding

    private lateinit var peca: Peca

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetalhesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        peca = intent.getSerializableExtra("PECA") as Peca
        bindPeca()
        setupBotaoCompartilhar()
    }


    private fun bindPeca() {
        binding.txtNomeDetalhe.text = peca.nome
        binding.txtCategoriaDetalhe.text = peca.categoria
        binding.txtDescricaoDetalhe.text = peca.descricao
        binding.txtPrecoDetalhe.text = "R$ %.2f".format(peca.preco)

        Glide.with(this)
            .load(peca.imagemUri)
            .placeholder(R.drawable.ic_image_placeholder)
            .error(R.drawable.ic_image_placeholder)
            .into(binding.imgPecaDetalhe)

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