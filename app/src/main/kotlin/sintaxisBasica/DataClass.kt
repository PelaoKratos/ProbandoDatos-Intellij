package org.movil.app.sintaxisBasica

import org.movil.app.Clases.Usuario

fun main(){
    val waco= Usuario("Wacoldo", 23, "waco@gmail.com")
    waco.nombre="Wacoldo"
    waco.edad=22;

    println(waco.toString())
}