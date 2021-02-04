package com.example.finalapp.clasesdatos

import java.io.Serializable

data class Zona (
    var idImagen: Int,
    var titulo: String,
    var descripcion: String,
    var calificacion: Double
) : Serializable