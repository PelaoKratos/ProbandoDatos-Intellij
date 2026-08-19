package org.movil.app.sintaxisBasica

fun main(){
    println("")
    var edad:Int=15

    if (edad < 18) {
        println("Es un puberto")
    }else if(edad>18 && edad<=60){
        println("Es adulto")
    }else{
        println("Es Tatita")
    }
    println("")
    when{
        edad<18->println("Me da ansiedad")
        edad>18->println("Es adulto")
        edad>=60->println("Falsa da ansiedad")
    }
}