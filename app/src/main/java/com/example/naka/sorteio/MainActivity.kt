package com.example.naka.sorteio

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonJogar.setOnClickListener {sortearNumero() }
    }
    fun sortearNumero() {

        val numero = Random().nextInt(11)

        textViewResposta.text = "O número sorteado foi: $numero."
    }
}
