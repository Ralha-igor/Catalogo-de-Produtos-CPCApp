package com.example.cpcapp.adapter
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.cpcapp.databinding.ItemLocalBinding
import com.example.cpcapp.model.Peca

class PecaAdapter(
    private val context: Context,
    private val onClick: (Peca) -> Unit
) : RecyclerView.Adapter<PecaAdapter.LocalViewHolder>() {

    private var listaLocais: MutableList<Peca> = mutableListOf()
    private var listaOriginal: List<Peca> = listOf()

    fun submitList(novaLista: List<Peca>) {
        listaOriginal = novaLista // Guarda lista completa
        listaLocais.clear()
        listaLocais.addAll(novaLista)
        notifyDataSetChanged()
    }

    fun filtrar(texto: String) {
        listaLocais.clear()
        if (texto.isEmpty()) {
            listaLocais.addAll(listaOriginal)
        } else {
            listaLocais.addAll(
                listaOriginal.filter {
                    it.nome.contains(texto, ignoreCase = true)
                }
            )
        }
        notifyDataSetChanged()
    }

    inner class LocalViewHolder(val binding: ItemLocalBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(local: Peca) {
            binding.txtNome.text = local.nome
            binding.txtCategoria.text = local.categoria
            binding.txtPreco.text = "R$ %.2f".format(local.preco)

            // Carrega a imagem com Glide
            Glide.with(context)
                .load(local.imagemUri)
                .into(binding.imgLocal)

            binding.root.setOnClickListener {
                onClick(local)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LocalViewHolder {
        val binding = ItemLocalBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )
        return LocalViewHolder(binding)
    }

    override fun onBindViewHolder(holder: LocalViewHolder, position: Int) {
        holder.bind(listaLocais[position])
    }

    override fun getItemCount(): Int = listaLocais.size
}
