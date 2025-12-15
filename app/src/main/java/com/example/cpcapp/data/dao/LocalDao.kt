package com.example.cpcapp.data.dao

import androidx.room.*
import com.example.cpcapp.model.Peca

@Dao
interface LocalDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun inserir(peca: Peca)

    @Update
    suspend fun atualizar(peca: Peca)

    @Delete
    suspend fun deletar(peca: Peca)

    @Query("SELECT * FROM peca ORDER BY nome ASC")
    suspend fun listarTodos(): List<Peca>

    @Query("SELECT * FROM peca WHERE nome LIKE '%' || :nome || '%' ORDER BY nome ASC")
    suspend fun buscarPorNome(nome: String): List<Peca>

    @Query("SELECT * FROM peca WHERE id = :id LIMIT 1")
    suspend fun buscarPorId(id: Int): Peca?
}
