package com.example.finalapp.actividades

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.finalapp.clasesdatos.Zona
import com.example.finalapp.R
import kotlinx.android.synthetic.main.activity_visor_imagen.*

class VisorImagen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_visor_imagen)

        val zona = intent.getSerializableExtra("zon") as Zona

        aviIvZona.setImageResource(zona.idImagen)
    }
}
