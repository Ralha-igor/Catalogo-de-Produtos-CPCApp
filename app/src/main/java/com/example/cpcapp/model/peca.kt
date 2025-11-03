package com.example.cpcapp.model

data class Peca(
    val id: Int,
    val nome: String,
    val categoria: String,
    val descricao: String,
    val imagem: Int,
    val preco: String = "R$ 299,90"
)