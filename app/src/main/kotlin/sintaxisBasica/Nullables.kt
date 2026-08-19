package org.movil.app.sintaxisBasica

import kotlin.time.measureTimedValue

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
    var resultado=numero!!+5 //Verificador de nulos !!
    println("\n"+resultado)
    //EJEMPLOS PRACTICO

    val x=4
    val y=10
    val z=3

    var mayor:Int?=null
    if (mayor!!<x || mayor==null){
        mayor=x
    }

}