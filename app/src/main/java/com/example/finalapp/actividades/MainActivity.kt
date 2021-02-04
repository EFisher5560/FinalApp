package com.example.finalapp.actividades

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.finalapp.adaptadores.AdaptadorZonas
import com.example.finalapp.clasesdatos.Zona
import com.example.finalapp.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        amRvZonas.layoutManager = LinearLayoutManager(this)
        amRvZonas.adapter = AdaptadorZonas(generarDatosPrueba(), this)

    }

    private fun generarDatosPrueba() : ArrayList<Zona>{
        val lista = ArrayList<Zona>()
        lista.add(Zona(R.drawable.fb_img_1560614374512, "Parque misantla", "Ubicado en la zona centro, un lugar perfecto para relajarse y caminar.", 5.0))
        lista.add(Zona(R.drawable.fb_img_1572502799392, "Callejon de Enriquez", "Un bello callejon que conecta la calle principal con la iglesia, perfecto para descansar durante el recorrido.",  4.85))
        lista.add(Zona(R.drawable._482202544273, "Rio Misantla", "Existen varias entradas a esta zona, y todas garantizan bellos paisajes, sobretodo en eso dias de calor.",  4.5))
        lista.add(Zona(R.drawable.fb_img_1544060108018, "Plaza de la concordia", "Esta zona cultural es la sede de diversos eventos culturales, sobre todo en fechas festivas, impresindible si se quiere concer la historia de la ciudad.", 4.25))
        lista.add(Zona(R.drawable._2071_8, "Iglesia", "El catolicismo es de las religiones mas influyentes, la iglesia es una zona de gran realce por este motivo, no obstante existen ademas diversos centros de diferentes religiones igualmente importantes.", 4.0))
        return lista
    }

}