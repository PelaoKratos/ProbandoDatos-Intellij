package org.movil.app.Clases

import kotlin.properties.Delegates

class Usuario2(
    val nome:String,
    val sobrenome:String,
    ) {
                        /* var sueldo:Int;     ASI PODRIA SER OTRA FORMA DE SER GETTER AND SETTER
                            get() {
                                return sueldo
                            }
                            set(value) {
                                sueldo=value
                            }*/

    var sueldo by Delegates.notNull<Int>()

    fun setSueldo(sueldo: Int) {
        this.sueldo = sueldo;
    }

    fun getSueldo(): Int = sueldo;

}