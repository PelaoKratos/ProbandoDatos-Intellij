package org.movil.app.sintaxisBasica

fun main(){
    var personas = listOf("Wacoldo", "Diogenes", "Wenceslao", "Amada", "Tertuliano")
    personas.forEach{p->println(p)}

    mifuncion("Wacoldo",{nombre_completo: String ->
        println(nombre_completo)
    })


    println(sumar(2,3,{x,y->x+y}))
}



fun mifuncion(nombre:String, saludar:(nombre_completo:String)->Unit){
    println("Entrando en mi funcion lamda")
    saludar("$nombre Soto")
    println("Finfnción")

    //fun fx(a,b,sumar:(x:Int,y:Int)->Unit){
}

fun sumar(x:Int,y:Int,operacion:(Int,Int)->Int):Int=operacion(x,y);