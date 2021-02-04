package com.example.finalapp.adaptadores

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.finalapp.clasesdatos.Zona
import com.example.finalapp.R
import com.example.finalapp.actividades.Detalles
import com.example.finalapp.actividades.VisorImagen
import kotlinx.android.synthetic.main.elemento_lista_zona.view.*

class AdaptadorZonas(private var lista: ArrayList<Zona>, private var contexto: Context) : RecyclerView.Adapter<AdaptadorZonas.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.elemento_lista_zona,
                parent,
                false
            ), contexto
        )
    }

    override fun getItemCount(): Int {
        return lista.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(lista[position])
    }

    class ViewHolder(private var vista: View, private var contexto: Context) : RecyclerView.ViewHolder(vista) {
        fun bind(zona: Zona) {
            vista.visorzona.setImageResource(zona.idImagen)
            vista.elpTvTitulo.text = zona.titulo
            vista.elpTvdescripcion.text = zona.descripcion
            vista.elpRbCalificacion.rating = zona.calificacion.toFloat()

            vista.visorzona.setOnClickListener {
                contexto.startActivity(Intent(contexto, VisorImagen::class.java).putExtra("zon", zona))
            }

            vista.setOnClickListener {
                contexto.startActivity(Intent(contexto, Detalles::class.java).putExtra("zon", zona))
            }
        }
    }

}