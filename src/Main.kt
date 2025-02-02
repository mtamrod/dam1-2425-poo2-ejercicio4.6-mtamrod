fun main() {
    val domicilio1 = Domicilio("Calle Payasete", 7)
    val domicilio2 = Domicilio("Calle Falsa", 23)

    val cliente1 = Cliente("Diegol", domicilio1)
    val cliente2 = Cliente("Coman", domicilio2)
    val cliente3 = Cliente("Goku", domicilio1) // Mismo domicilio que Diegol

    val compra1 = Compra(cliente1, "25", 100.0)
    val compra2 = Compra(cliente2, "08", 150.0)
    val compra3 = Compra(cliente3, "04", 200.0)

    val repo = RepositorioCompras()
    repo.agregarCompra(compra1)
    repo.agregarCompra(compra2)
    repo.agregarCompra(compra3)

    println("Domicilios únicos para facturación:")
    repo.domicilios().forEach { println(it.dirCompleta()) }
}