package org.movil.app.sintaxisBasica

import kotlin.properties.Delegates

class Usuario(string: String, i: Int, string1: String) {
    lateinit var nombre: String; //LATEINIT SE USA PARA NO OCUPAR MEMORIA SI EsTA VACIO, ASI NO GASTA MEMORIA EN EL MOVIL
    var edad by Delegates.notNull<Int>()
    private lateinit var email: String;
    private val amigos=mutableListOf<Usuario>();

    fun setNombre(nombre:String){
        this.nombre=nombre
    }
    fun getNombre(): String {
        return nombre
    }

    fun getEmail(): String {
        return email
    }

    fun setEmail(email: String){
        this.email=email;
    }

    fun listaAmiguis(){
        amigos.forEach { f->println(f) }
    }

    fun setEdad(edad:Int){
        this.edad=edad;
    }

    fun getEdad():Int{return edad;}
}

