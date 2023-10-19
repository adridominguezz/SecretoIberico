package com.example.secretoiberico

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun abrirAjustes(view: View) {
        val intentAjustes = Intent(this, AjustesActivity::class.java)
        startActivity(intentAjustes)
    }
    fun abrirJuego(view: View) {
        val intentJuego = Intent(this, JuegoActivity::class.java)
        startActivity(intentJuego)
    }
}