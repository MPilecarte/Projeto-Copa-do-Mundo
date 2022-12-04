package com.example.projetocopadomundo.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.projetocopadomundo.R
import com.example.projetocopadomundo.model.jogadores

//O AdapterJogador irá herdar as carateristicas de um RecycleView
class AdapterJogador(private val context: Context, private val jogador: MutableList<jogadores>): RecyclerView.Adapter<AdapterJogador.JogadorViewHolder>() {

    inner class JogadorViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val foto = itemView.findViewById<ImageView>(R.id.fotoJogador)
        val nome = itemView.findViewById<TextView>(R.id.nomeJogador)
        val posicao = itemView.findViewById<TextView>(R.id.PosicaoJogador)
    }

    //método responsavel por criar as visualizações na tela
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): JogadorViewHolder {
        val itemLista = LayoutInflater.from(context).inflate(R.layout.jogador_item, parent,false)
        val holder = JogadorViewHolder(itemLista)
        return holder
    }

    //método responsavel por exibir as visualizações da lista na tela
    override fun onBindViewHolder(holder: JogadorViewHolder, position: Int) {
        holder.nome.text = jogador[position].nome
        holder.foto.setImageResource(jogador[position].foto)
        holder.posicao.text = jogador[position].nome
    }

    override fun getItemCount(): Int = jogador.size

}