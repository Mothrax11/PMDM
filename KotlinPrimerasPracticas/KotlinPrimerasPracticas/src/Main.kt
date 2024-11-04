//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*

fun main() {
    //val num1:Int = 2
    //val num2:Int = 4
    //println("Valor 1 = " + num1 + "\n" +"Valor 2 = " + num2)
    //println("La suma es: " + sum(num1, num2))
    //println("La resta es: " + rest(num1, num2))
    //println("La multiplicacion es: " + mult(num1, num2))
    //println("Suma: " + calcFloat())
    //concatenacion()
    //multiConcat()
    //meses(5)
    //trimestres(5)
    //cuatrimestres(8)
    //notificaciones(51)
    //precioEntradas()
    //temperaturas(27.0)
    //temperaturas(350.0)
    //temperaturas(10.0)
    //arrays()
    //listas()
    //mapas()
    //fors()
    //lambdas()
    //miFuncionOperacion(5, 10, {x, y -> x - y})
    temperaturasLambda(14.00, {(it * 9 / 5) + 32)}
}
fun concatenacion(){
    val saludo = "Hola me llamo"
    val nombre = "Raúl"
    println("$saludo $nombre")
}
fun calcFloat():Int{
    val a:Float = 10.5f
    val b:Int= 5
    val calc:Int = (a + b).toInt()
    return calc;
}

fun sum (a:Int, b:Int): Int {
    return (a + b);
}

fun rest (a:Int, b:Int): Int{
    return a - b;
}

fun multiConcat(){
    var num1 = 2
    var num2 = 5
    var sum = num1 + num2;
    println("El resultado de $num1 mas $num2 es: $sum")
}

fun mult (a:Int, b:Int): Int{
    return a * b;
}

fun meses(a:Int){
    if (a < 1 || a > 12){
        println("Estimado/a señor/a,\n" +
                "\n" +
                "Lamentamos profundamente informarle que el valor ingresado no se ajusta a los parámetros establecidos. Según nuestras directrices, solo se permite el ingreso de valores numéricos comprendidos entre 1 y 12, ambos inclusive. Le agradeceríamos encarecidamente que, a la mayor brevedad posible, revise la información proporcionada y proceda con una nueva selección acorde a los requisitos mencionados.\n" +
                "\n" +
                "Quedamos a su entera disposición para cualquier consulta o asistencia adicional que pueda requerir.")
    }

    when(a){
        1 -> println("Enero")
        2 -> println("Febrero")
        3 -> println("Marzo")
        4 -> println("Abril")
        5 -> println("Mayo")
        6 -> println("Junio")
        7 -> println("Julio")
        8 -> println("Agosto")
        9 -> println("Septiembre")
        10 -> println("Octubre")
        11 -> println("Noviembre")
        12 -> println("Diciembre")
    }
}

fun trimestres(a:Int){
    if (a < 1 || a > 12){
        println("Estimado/a señor/a,\n" +
                "\n" +
                "Lamentamos profundamente informarle que el valor ingresado no se ajusta a los parámetros establecidos. Según nuestras directrices, solo se permite el ingreso de valores numéricos comprendidos entre 1 y 12, ambos inclusive. Le agradeceríamos encarecidamente que, a la mayor brevedad posible, revise la información proporcionada y proceda con una nueva selección acorde a los requisitos mencionados.\n" +
                "\n" +
                "Quedamos a su entera disposición para cualquier consulta o asistencia adicional que pueda requerir.")
    }

    when(a) {
        1, 2, 3 -> println("Primer Trimestre")
        4, 5, 6 -> println("Segundo Trimestre")
        7, 8, 9 -> println("Tercer Trimestre")
        10, 11, 12 -> println("Cuarto Trimestre")
    }
}

fun cuatrimestres(a:Int){
    val cuatri1 = setOf(1,2,3,4);
    val cuatri2 = setOf(5,6,7,8);
    val cuatri3 = setOf(9,10,11,12);

    if (a < 1 || a > 12){
        println("Estimado/a señor/a,\n" +
                "\n" +
                "Lamentamos profundamente informarle que el valor ingresado no se ajusta a los parámetros establecidos. Según nuestras directrices, solo se permite el ingreso de valores numéricos comprendidos entre 1 y 12, ambos inclusive. Le agradeceríamos encarecidamente que, a la mayor brevedad posible, revise la información proporcionada y proceda con una nueva selección acorde a los requisitos mencionados.\n" +
                "\n" +
                "Quedamos a su entera disposición para cualquier consulta o asistencia adicional que pueda requerir.")
    }


    when(a) {
        in 1 .. 4 -> println("Primer Cuatrimestre")
        in 5 .. 8 -> println("Segundo Cuatrimestre")
        in 9 .. 12  -> println("Tercer Cuatrimestre")
    }

    if (cuatri1.contains(a)){
        println("Primer Cuatrimestre")
    } else if (cuatri2.contains(a)) {
        println("Segundo Cuatrimestre")
    } else if (cuatri3.contains(a)){
        println("Tercer Cuatrimestre")
    }
}

fun notificaciones(noti:Int) {
    when (noti) {
        in 1..99 -> println("Tienes " + noti + " notificaciones.")
        else -> println("¡Tu teléfono está explotando! Tienes 99+ notificaciones.")
    }
}

fun precioEntradas(){
    val edad:Int = readln().toInt()
    val dia:String = readln()
          when (edad) {
              in 0..12 -> println("El precio de la entrada al cine para una persona de " + edad + " es de 5.4 euros.")
              in 13..60 -> if (dia.lowercase() == "lunes") {
                  println("El precio de la entrada al cine para una persona de " + edad + " es de 6,7 euros.")
              } else {
                  println("El precio de la entrada al cine para una persona de " + edad + " es de 8.5 euros.")
              }
              in 61..100 -> println("El precio de la entrada al cine para una persona de " + edad + " es de 5.0 euros.")
              else -> println(-1)
          }
}

fun temperaturas (grados:Double){
    val sc = Scanner(System.`in`)
    println("Escribe 1 si la conversion es de Celsius a Fahrenheit")
    println("Escribe 2 si la conversion es de Kelvin a Celsius")
    println("Escribe 3 si la conversion es de Fahrenheit a Kelvin")
    val gc:Int = sc.nextInt()
    sc.close()
    val v1:Double = (grados * 9 / 5) + 32
    val v2:Double = (grados -273.15)
    val v3:Double = (grados - 32) * 5 / 9 + 273.15

    if (gc == 1){
        println("$grados grados Celsius son " + (String.format("%.2f", v1)) + " grados Fahrenheit")
    }
    if (gc == 2){
        println("$grados grados Kelvin son " + (String.format("%.2f", v2)) + " grados Celsius")
    }
    if (gc == 3){
        println("$grados grados Fahrenheit son " + (String.format("%.2f", v3)) + " grados Kelvin")
    }
}

fun arrays(){
    val semana = arrayOf("Lunes", "Martes", "Miercoles","Jueves","Viernes", "Sabado", "Domingo")
    println(semana[0])
    println(semana.get(1))
    println(semana.size)
    println(semana.get(semana.size - 1))
    println(semana.set(0, "Monday"))

    for (i in semana){
        println(i)
    }

    for ((posicion, valor) in semana.withIndex()){
        println("La posicion es $posicion y el valor es $valor")
    }
}

fun listas(){
    val semana: List<String> = listOf("Lunes", "Martes", "Miercoles","Jueves","Viernes", "Sabado", "Domingo")
    println(semana.size)

    val semanaMutable: MutableList<String> = mutableListOf("Lunes", "Martes", "Miercoles","Jueves","Viernes")
    val semanaMutable2: MutableList<String> = mutableListOf("Sabado", "Domingo")
    println(semanaMutable)
    semanaMutable.addAll(semanaMutable2)
    println(semanaMutable)
    println(semanaMutable.none())
    println(semanaMutable)
    println(semanaMutable.firstOrNull())
    println(semanaMutable.elementAtOrNull(2))
    println(semanaMutable.lastOrNull())

    for ((posicion, valor) in semanaMutable.withIndex()){
        println("La posicion $posicion contiene $valor")
    }

    val nuevaLista: MutableList<String> = mutableListOf()
    semanaMutable2.forEach{
        nuevaLista.add(it + " Mutante")
    }
    println(nuevaLista)
}

fun mapas(){
    val mapa = mapOf(1 to "Manzana", 2 to "Pera", 3 to "Melocotón")
    val mapaVacio = mapOf<Int, String>()
    val mapaMutable = mutableMapOf(1 to "Manzana", 2 to "Pera", 3 to "Melocotón")
    val mapaMutableVacio = mutableMapOf<String, String>()
    println(mapa.entries)
    println(mapa.keys)
    println(mapa.values)
    println(mapa.size)
    println(mapa[2])
    println(mapa.getValue(2))
    println(mapa.getOrDefault(3, "No existe"))
    println(mapa.getOrDefault(4, "No existe"))
    if(mapa.contains(1)){
        println("Existe la clave")
    } else {
        println("No existe la clave")
    }

    if(mapa.contains(4)){
        println("Existe la clave")
    } else {
        println("No existe la clave")
    }
    println(mapaMutable.clear())
    println(mapaMutable)
}

fun fors(){
    for(c in 0 ..  10){
        println(c)
    }
}

fun lambdas(){
    val listaNumeros = arrayListOf(0,1,2,3,4,5,6,7,8,9)
    val listaFiltrados = listaNumeros.filter{miNumero ->
        miNumero > 5 || miNumero == 1
        }
    println(listaFiltrados)

    var miFuncionSuma = fun(x:Int, y:Int): Int = x + y;
    var miFuncionMultiplicar = fun(x:Int, y:Int): Int = x * y;
    println(miFuncionSuma(5,10))
    println(miFuncionMultiplicar(5,10))

}

fun miFuncionOperacion(x:Int, y:Int, miFuncion: (Int,Int) -> Int) : Int {
    println(miFuncion(x,y))
    return miFuncion(x, y)
}


fun temperaturasLambda (grados:Double, gc:Int, tempFuncionLambda: (Double) -> Double) {
    var cf = fun(grados:Double): Double = (grados * 9 / 5) + 32
    var kc = fun(grados:Double): Double = (grados - 273.15)
    var fk = fun(grados:Double): Double = (grados - 32) * 5 / 9 + 273.15
}