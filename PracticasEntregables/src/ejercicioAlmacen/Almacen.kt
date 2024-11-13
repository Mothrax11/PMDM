package ejercicioAlmacen

class Almacen{

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


    fun agregarBebida(Bebida:Bebida){
        var bebidaRepe = false;

        for (i in estanteria.indices){
            for (j in estanteria[i]){
                if(j != null){
                    if (j.id == Bebida.id) {
                        bebidaRepe = true;
                    }
                }
            }
        }

        if(!bebidaRepe){
            for (i in estanteria.indices){
                for (j in estanteria[i]){
                    if (j == null) {
                        estanteria[i].add(Bebida)
                    }
                }
            }
        }
    }

    fun eliminarBebida(id:Long){
        for (i in estanteria.indices){
            for (j in estanteria[i]){
                if (j != null) {
                    if (j.id == id) {
                        estanteria[i].removeAt(i)
                    }
                }
            }
        }
    }
    //Calcular precio TOTAL
    fun calcularPrecio (){
        var precioTotal:Double = 0.0;
        for (i in estanteria.indices){
            for (j in estanteria[i]){
                if (j != null) {
                    precioTotal =+ j.precio
                }
            }
        }
        println("El precio total de todas las bebidas de la estanteria es de $precioTotal")
    }

    //Calcular precio por columna
    fun calcularPrecio (columna:Int){
        var precioTotalColumna:Double = 0.0;
        for (i in estanteria.indices){
            for (j in estanteria[i]){
                if (j != null) {
                    precioTotalColumna =+ j.precio
                }
            }
        }
        println("El precio total de la columna $columna es de $precioTotalColumna")
    }


    fun mostrarBebidas(){
        for (i in estanteria.indices){
            for (j in estanteria[i]){
                if (j != null) {
                    println("---------- Datos de la bebida ----------")
                    println(j)

                }
            }
        }
    }



}
