package org.movil.app.Clases

// Data class usada para representar entidades con datos.
// Genera automáticamente métodos útiles como equals(), hashCode(),
// toString() y copy(), lo que simplifica el manejo de objetos.
// Ideal para modelos de datos como Persona (nombre, apellido, edad).

data class Personadta(
    var nombre: String,
    var apellido: String,
    var edad: Int,
)