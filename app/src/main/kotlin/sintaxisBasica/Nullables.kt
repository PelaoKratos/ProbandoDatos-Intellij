package org.movil.app.sintaxisBasica

fun main(){
    //PARA STRING
    var nombre = "Wacoldo"
    var curso: String?="Movil"

    if (curso.isNullOrBlank()){
        println("Curso no definido")
    }else{
        println("$nombre esta cursando $curso")
    }

    var numero:Int?=null
    var resultado=numero+5
    println(resultado)
}