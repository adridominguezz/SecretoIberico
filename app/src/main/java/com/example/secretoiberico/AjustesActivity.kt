package com.example.secretoiberico

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class AjustesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ajustes)
    }

    fun abrirIdioma(view: View) {}
    fun abrirVolumenJuego(view: View) {
        
    }
    fun abrirVolumenMusica(view: View) {}
    fun abrirVibracion(view: View) {}
    fun abrirAyuda(view: View) {}
    fun volverInicio(view: View) {
        val intentInicio = Intent(this, MainActivity::class.java)
        startActivity(intentInicio)
    }
}