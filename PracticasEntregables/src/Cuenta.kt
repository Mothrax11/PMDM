class Cuenta {
    var titular:String;
    var cantidad:Double = 0.0;

    constructor(titular:String, cantidad:Double){
        this.titular = titular;
        this.cantidad = cantidad;
    }

    constructor(titular:String){
        this.titular = titular;
    }


    public fun ingresar (cantidadSumar: Double){
        if(cantidadSumar > 0){
            this.cantidad = this.cantidad + cantidadSumar;
        }
    }

    public fun retirar(cantidadfRetirar:Double){
        if((this.cantidad - cantidadfRetirar) < 0){
            this.cantidad = 0.0;
        } else {
            this.cantidad = this.cantidad - cantidadfRetirar;
        }
    }

}