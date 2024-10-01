package cl.bootcamp.ejercicioindividual4

class UserManager {
    val listUser = mutableListOf<Usuario>()

    fun addUser(usuario: Usuario) {
        listUser.add(usuario)
    }

    fun deleteUser(nombre: String) {
        listUser.removeIf { it.name == nombre }
    }

    fun showList() {
        listUser.forEach { usuario ->
            println("Nombre: ${usuario.name}")
            println("Edad: ${usuario.age}")
            println("Trabajo: ${usuario.work ?: "No especificado"}")
            println("Referencia: ${usuario.reference?.name ?: "Ninguna"}")
            println("-----------------------------")
        }
    }
}

fun main() {
    val manager = UserManager()

    // Agregar usuarios
    manager.addUser(Usuario("Juan Jose Gazmuri", 30, "Programador"))
    manager.addUser(Usuario("Ana Maria García", 25, "Diseñadora", manager.listUser[0]))
    manager.addUser(Usuario("Marta Gomez", 21, "UI UX"))
    manager.addUser(Usuario("Manual Fortuna", 36, "QA"))
    manager.addUser(Usuario("Marcelo Gazmuri", 25, "Programador"))

    // Mostrar lista inicial
    manager.showList()

    // Eliminar un usuario
    manager.deleteUser("Ana Maria García")

    // Mostrar lista actualizada
    manager.showList()

}