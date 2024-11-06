

fun main(){
    val cuenta1 = Cuenta("Gregorio Constantino Perez", 100.0)
    println(cuenta1.titular)
    println(cuenta1.cantidad)
    cuenta1.ingresar(50.0)
    println(cuenta1.cantidad)
    cuenta1.retirar(70.0)
    println(cuenta1.cantidad)
}




