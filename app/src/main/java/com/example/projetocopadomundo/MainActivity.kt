package com.example.projetocopadomundo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

   

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botaoEscalacao = findViewById<Button>(R.id.btnEscalacao)
            botaoEscalacao.setOnClickListener{
            Escalacao()
        }
    }
    private fun Escalacao(){
        val listaJogadores = Intent(this,ListaJogadores::class.java)
        startActivity(listaJogadores)
    }
}