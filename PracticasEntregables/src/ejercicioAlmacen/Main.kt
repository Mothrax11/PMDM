package ejercicioAlmacen

fun main() {
    val almacen = Almacen()
    almacen.constructor()
    val agua1 = Bebida("FontVella", "Avilés", 1, 1.5, 1.5)
    val agua2 = Bebida("Lanjarón", "Gijon", 2, 2.0, 1.5)
    val refresco1 = Bebida("Coca-Cola", 10.0, 3, 1.8, true, 1.25)
    val refresco2 = Bebida("Fanta", 8.0, 4, 1.5, false, 1.5)
    val refresco3 = Bebida("Sprite", 7.0, 5, 1.2, true, 1.0)
    val refresco4 = Bebida("Kas", 4.0, 6, 2.2, false, 1.0)

    // Agregar bebidas al almacén
    println("Agregando bebidas al almacén...")
    almacen.agregarBebida(agua1)
    almacen.agregarBebida(agua2)
    almacen.agregarBebida(refresco1)
    almacen.agregarBebida(refresco2)
    almacen.agregarBebida(refresco3)
    almacen.agregarBebida(refresco4)

    // Mostrar bebidas en el almacén
    println("\nBebidas almacenadas:")
    almacen.mostrarBebidas()

    // Intenta agregar una bebida con el mismo ID (no debe agregarse)
    println("\nIntentando agregar una bebida duplicada:")
    val duplicado = Bebida("Coca-Cola", 10.0, 3, 2.0, true, 1.5)
    almacen.agregarBebida(duplicado)

    // Mostrar nuevamente las bebidas (para confirmar que no se agregó)
    println("\nBebidas almacenadas después de intentar agregar duplicado:")
    almacen.mostrarBebidas()

    // Calcular precio total de todas las bebidas
    println("\nCalculando precio total de todas las bebidas:")
    println(almacen.calcularPrecio());

    // Calcular precio total de bebidas de una marca específica
    println("\nCalculando precio total de la marca Coca-Cola:")
    val precioCocaCola = almacen.calcularPrecio("Coca-Cola")
    println("El precio total de las bebidas de Coca-Cola es de $precioCocaCola")

    // Calcular precio total de una columna específica
    println("\nCalculando precio total de la columna 0:")
    println(almacen.calcularPrecio(0));

    // Eliminar una bebida por ID
    val eliminado = almacen.eliminarBebida(3)
    if (eliminado) {
        println("Bebida eliminada correctamente.")
    } else {
        println("No se encontró la bebida con el ID especificado.")
    }

    // Mostrar bebidas después de la eliminación
    almacen.mostrarBebidas()

    almacen.mostrarEstructura()
}
