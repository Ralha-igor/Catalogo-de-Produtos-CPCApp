package com.example.cpcapp.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable


@Entity(tableName = "peca")
data class Peca(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val nome: String,
    val categoria: String,
    val descricao: String,
    val imagemUri: String,
    val preco: Double
) : Serializable


