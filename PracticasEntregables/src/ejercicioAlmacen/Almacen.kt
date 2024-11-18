package ejercicioAlmacen

class Almacen {
    private lateinit var fila1:MutableList<Bebida?>;
    private lateinit var fila2:MutableList<Bebida?>;
    private lateinit var fila3:MutableList<Bebida?>;
    private lateinit var fila4:MutableList<Bebida?>;
    private lateinit var fila5:MutableList<Bebida?>;
    private lateinit var estanteria: MutableList<MutableList<Bebida?>>

    fun constructor(){
        fila1 = MutableList(5) { null }
        fila2 = MutableList(5) { null }
        fila3 = MutableList(5) { null }
        fila4 = MutableList(5) { null }
        fila5 = MutableList(5) { null }
        estanteria = arrayListOf(fila1, fila2, fila3, fila4, fila5);
    }

    fun agregarBebida(bebida: Bebida) {
        for (fila in estanteria) {
            for (i in fila.indices) {
                if (fila[i]?.id == bebida.id) {
                    println("Error: La bebida con ID ${bebida.id} ya existe.");
                    return;
                }
            }
        }
        for (fila in estanteria) {
            for (i in fila.indices) {
                if (fila[i] == null) {
                    fila[i] = bebida;

                    println("Bebida agregada: ${bebida}");
                    return;
                }
            }
        }
        println("Error: El almacén está lleno.");
    }

    fun eliminarBebida(id: Long): Boolean {
        for (fila in estanteria) {
            for (i in fila.indices) {
                if (fila[i]?.id == id) {
                    fila[i] = null;
                    return true;
                }
            }
        }
        return false;
    }

    fun calcularPrecio(): Double {
        var precioTotal = 0.0
        for (fila in estanteria) {
            for (bebida in fila) {
                if (bebida != null) {
                    precioTotal += bebida.precio;
                }
            }
        }
        return precioTotal
    }

    fun calcularPrecio(marca: String): Double {
        var precioTotal = 0.0
        for (fila in estanteria) {
            for (bebida in fila) {
                if (bebida != null && bebida.marca == marca) {
                    precioTotal += bebida.precio
                }
            }
        }
        return precioTotal
    }

    fun calcularPrecio(columna: Int): Double {
        if (columna !in 0..4) {
            println("Error: La columna $columna no es válida.")
            return 0.0
        }
        var precioTotal = 0.0
        for (fila in estanteria) {
            if (fila[columna] != null) {
                precioTotal += fila[columna]?.precio ?: 0.0
            }
        }
        return precioTotal
    }

    fun mostrarBebidas() {
        for (fila in estanteria) {
            for (bebida in fila) {
                bebida?.let { println(it) }
            }
        }
    }

    fun mostrarEstructura() {
        for (i in estanteria.indices) {
            val ids = mutableListOf<String>()
            for (bebida in estanteria[i]) {
                if (bebida != null) {
                    ids.add(bebida.id.toString())
                } else {
                    ids.add("vacío")
                }
            }
            println("Fila $i: $ids")
        }
    }
}
