package ejercicioAlmacen

class Bebida {
    var origen:String = "";
    var id:Long = 0;
    var marca:String = "";
    var litros:Double = 0.0;
    var precio:Double = 0.0;
    var porcentaje:Double = 0.0;
    var promoActiva:Boolean = false;

    constructor(marca:String, origen:String, id:Long){
        this.marca = marca;
        this.litros = litros;
        this.origen = origen;
        this.id = id;
    }

    constructor(marca:String, porcentaje:Double, id:Long, precio:Double, promoActiva:Boolean){
        this.marca = marca;
        this.litros = litros;
        this.precio = precio
        this.porcentaje = porcentaje;
        this.promoActiva = promoActiva;
        this.id = id;
    }




}