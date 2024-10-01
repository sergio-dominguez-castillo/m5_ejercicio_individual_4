package cl.bootcamp.ejercicioindividual4

class Usuario(
    val name: String,
    val age: Int,
    val work: String? = null,
    val reference: Usuario? = null
) {
    fun showData() {
        println("Nombre: $name")
        println("Edad: $age")
        println("Trabajo: ${work ?: "No especificado"}")
        println("Referencia: ${reference?.name ?: "Sin referencia"}")
        println("-------------------------------------------")
    }
}

fun main() {
    // Crear dos usuarios
    val usuario1 = Usuario("Juan Jose Gazmuri", 30, "Programador")
    val usuario2 = Usuario("Ana Maria Garcia", 25, "Diseñadora", usuario1)

    // Mostrar los datos de los usuarios
    usuario1.showData()
    usuario2.showData()
}