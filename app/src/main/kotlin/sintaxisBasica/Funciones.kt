package org.movil.app.sintaxisBasica

fun main(){
    println("Las suma es ${suma(5,10)}")
    println("Las suma es ${suma2(5,5)}")
}

//def suma(a:int,b:int)->int:     ASI ERA EN PYTHON
//FUNCION CON SITAXIS TRADICIONAL
fun suma(a: Int, b: Int): Int {
    return a + b
}

//FUNCION DE UNA SOLA EXPRESION
fun suma2(a: Int, b: Int) = a + b

//FUNCION DE ORDEN SUPERIOR
/*fun calcular(a: Int, b: Int): Int {
    return
}
*/