package com.example.cpcapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.cpcapp.R
import com.example.cpcapp.model.Peca

class PecaAdapter(
    private val pecas: List<Peca>,
    private val onItemClick: (Peca) -> Unit
) : RecyclerView.Adapter<PecaAdapter.PecaViewHolder>() {

    class PecaViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imagem: ImageView = itemView.findViewById(R.id.imgPeca)
        val nome: TextView = itemView.findViewById(R.id.txtNome)
        val categoria: TextView = itemView.findViewById(R.id.txtCategoria)
        val preco: TextView = itemView.findViewById(R.id.txtPreco)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PecaViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_peca, parent, false)
        return PecaViewHolder(view)
    }

    override fun onBindViewHolder(holder: PecaViewHolder, position: Int) {
        val peca = pecas[position]

        holder.imagem.setImageResource(peca.imagem)
        holder.nome.text = peca.nome
        holder.categoria.text = peca.categoria
        holder.preco.text = peca.preco

        holder.itemView.setOnClickListener {
            onItemClick(peca)
        }
    }

    override fun getItemCount(): Int = pecas.size
}