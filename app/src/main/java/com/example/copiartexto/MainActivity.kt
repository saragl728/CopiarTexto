package com.example.copiartexto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.copiartexto.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        //se pone el binding
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //el código con binding
        binding.bMostrar.setOnClickListener {
            binding.mostradorTexto.text = "Hola, " + binding.editorTexto.text
            //mostrar con una tostada
            Toast.makeText(this, "Esto es una tostada", Toast.LENGTH_LONG).show()
        }

        binding.bLimpiar.setOnClickListener {
            binding.mostradorTexto.text = ""
            binding.editorTexto.text.clear()
        }

        //referencia al botón de Mostar
        /*var bMostrar = findViewById<Button>(R.id.bMostrar)

        var bLimpiar = findViewById<Button>(R.id.bLimpiar)

        //referencia al texto introducido
        var textoIntro = findViewById<EditText>(R.id.editorTexto)

        //referencia al texto de salida
        var textoSalida = findViewById<TextView>(R.id.mostradorTexto)

        //lo que hace el botón de mostrar
        bMostrar.setOnClickListener {
            textoSalida.text = "Hola, " + textoIntro.text.toString()
            // }
        }

        //lo que hace el botón de limpiar
        bLimpiar.setOnClickListener {
            textoIntro.text.clear()
            textoSalida.text = ""
        }*/

    }
}