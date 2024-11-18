package ejercicioAlmacen

class Bebida {
    var origen: String = ""
    var id: Long = 0
    var marca: String = ""
    var litros: Double = 0.0
    var precio: Double = 0.0
    var porcentaje: Double = 0.0
    var promoActiva: Boolean = false

    // Constructor para agua mineral
    constructor(marca: String, origen: String, id: Long, litros: Double, precio: Double) {
        this.marca = marca
        this.precio = precio
        this.litros = litros
        this.origen = origen
        this.id = id
    }

    // Constructor para bebidas azucaradas
    constructor(marca: String, porcentaje: Double, id: Long, precio: Double, promoActiva: Boolean, litros: Double) {
        this.marca = marca
        this.litros = litros
        this.precio = if (promoActiva) precio * 0.9 else precio
        this.porcentaje = porcentaje
        this.promoActiva = promoActiva
        this.id = id
    }

    override fun toString(): String {
        return if (origen.isNotEmpty()) {
            "Agua Mineral: ID=$id, Marca=$marca, Origen=$origen, Litros=$litros, Precio=$precio"
        } else {
            "Bebida Azucarada: ID=$id, Marca=$marca, Porcentaje Azúcar=$porcentaje%, Litros=$litros, Precio=$precio, Promoción=${if (promoActiva) "Activa" else "No activa"}"
        }
    }
}
