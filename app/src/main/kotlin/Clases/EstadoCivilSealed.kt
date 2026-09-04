package org.movil.app.Clases


// Sealed class usada para representar un conjunto cerrado de estados posibles.
// Garantiza que todas las variantes (ej: Soltero, Casado, Viudo, etc.) estén
// definidas en un mismo archivo y que el compilador pueda verificar exhaustivamente
// los casos al usar 'when'. Esto mejora la seguridad del tipo y evita estados inválidos.

sealed class EstadoCivilSealed {
    object Soltero: EstadoCivilSealed()
    object Casado: EstadoCivilSealed()
    object Viudo: EstadoCivilSealed()
    object Divorcio: EstadoCivilSealed()
}