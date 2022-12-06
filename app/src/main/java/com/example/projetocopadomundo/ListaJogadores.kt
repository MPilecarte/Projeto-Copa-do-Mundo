package com.example.projetocopadomundo

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.projetocopadomundo.Adapter.AdapterJogador
import com.example.projetocopadomundo.model.jogadores

class ListaJogadores(contentLayoutId: Int) : AppCompatActivity(contentLayoutId) {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.jogador_item)

        val recycle_jogador = findViewById<RecyclerView>(R.id.recycleView_jogadores)//criando uma variavel para chamar o id da RicycleView
        recycle_jogador.layoutManager = LinearLayoutManager(this) //colocando a lista na vertical
        recycle_jogador.setHasFixedSize(true)


        //Configurando o Adapter
        val listaJogadores: MutableList<jogadores> = mutableListOf()
        val AdapterJogador = AdapterJogador(this,listaJogadores)
        recycle_jogador.adapter = AdapterJogador

        val jogador1 = jogadores(
            R.drawable.vincente_abubakar,
            "Vincent Abubakar",
            "Centroavante"
        )
        listaJogadores.add(jogador1)

        val jogador2 = jogadores(
            R.drawable.andrpe_onana,
            "Andre Onana",
            "Goleiro"
        )
        listaJogadores.add(jogador2)

        val jogador3 = jogadores(
            R.drawable.eric_maxim,
            "Eric Maxim",
            "Centroavante"
        )
        listaJogadores.add(jogador3)

        val jogador4 = jogadores(
            R.drawable.andre_frank,
            "André Frank",
            "Meio-Campo"
        )
        listaJogadores.add(jogador4)

        val jogador5 = jogadores(
            R.drawable.devis_epassy,
            "Devis Epassy",
            "Goleiro"
        )
        listaJogadores.add(jogador5)

        val jogador6 = jogadores(
            R.drawable.karl_toko,
            "Karl Toko",
            "Ponta Esq."
        )
        listaJogadores.add(jogador6)

        val jogador7 = jogadores(
            R.drawable.nicolas_moumi,
            "Nicolas Moumi",
            "Ponta Esq."
        )
        listaJogadores.add(jogador7)

        val jogador8 = jogadores(
            R.drawable.oliver_mbaizo,
            "Oliver Mbaizo",
            "Lateral Dir."
        )
        listaJogadores.add(jogador8)

        val jogador9 = jogadores(
            R.drawable.samuel_oum,
            "Samuel Oum",
            "Zagueiro"
        )
        listaJogadores.add(jogador9)

        val jogador10 = jogadores(
            R.drawable.nouhou,
            "Nouhou",
            "Lateral Esq."
        )
        listaJogadores.add(jogador10)

        val jogador11 = jogadores(
            R.drawable.martin_hongla,
            "Martin Hongla",
            "Volante"
        )
        listaJogadores.add(jogador11)

        val jogador12 = jogadores(
            R.drawable.collins_fai,
            "Collins Fai",
            "Lateral Dir."
        )
        listaJogadores.add(jogador12)

        val jogador13 = jogadores(
            R.drawable.jean_charles,
            "Jean-Charles",
            "Zagueiro"
        )
        listaJogadores.add(jogador13)

        val jogador14 = jogadores(
            R.drawable.stephane_bahoken,
            "Stéphen Bahoken",
            "Zagueiro"
        )
        listaJogadores.add(jogador14)

        val jogador15 = jogadores(
            R.drawable.james_lea,
            "James Léa",
            "Zagueiro"
        )
        listaJogadores.add(jogador15)

        val jogador16 = jogadores(
            R.drawable.pierre_kunde,
            "Pierre Kunde",
            "Meio Central"
        )
        listaJogadores.add(jogador16)

        val jogador17 = jogadores(
            R.drawable.harold_moukoudi,
            "Harold Moukoudi",
            "Zagueiro"
        )
        listaJogadores.add(jogador17)

        val jogador18 = jogadores(
            R.drawable.michael_ngadeu,
            "Michael Ngadeu",
            "Zagueiro"
        )
        listaJogadores.add(jogador18)
    }

}