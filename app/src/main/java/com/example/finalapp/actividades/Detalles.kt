package com.example.finalapp.actividades

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.finalapp.R
import com.example.finalapp.clasesdatos.Zona
import kotlinx.android.synthetic.main.activity_detalles.*

class Detalles : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalles)

        val zona = intent.getSerializableExtra("zon") as Zona

        adTvTitulo.text = getString(R.string.titulo, zona.titulo)
        adTvcalificacion.text = getString(R.string.calificacion, zona.calificacion.toString())
        adTvdescripcion.text= getString(R.string.descripcion, zona.descripcion)



    }
}