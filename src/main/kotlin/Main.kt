import javax.swing.JOptionPane
fun main() {


    val texto=JOptionPane.showInputDialog("ingresa una lista de números separados por comas")
    val listaNumerosTexto=texto.split(",".toRegex()).toTypedArray()
    val cantidad=listaNumerosTexto.size
    val listaNumeros=IntArray(cantidad)
    for (i in (0 until cantidad)){
        listaNumeros[i]=listaNumerosTexto[i].toInt()
    }
    var tem=0
    for(i in (0 until cantidad-1)){
        for(j in (0 until cantidad-1)){
            if(listaNumeros[j]>listaNumeros[j+1]){
                tem=listaNumeros[j]
                listaNumeros[j]=listaNumeros[j+1]
                listaNumeros[j+1]=tem
            }
        }
    }
    println("aquí están los números ordenados de forma ascendente")
    for (i in (0 until cantidad)){
        println(listaNumeros[i])
    }
    println("Humano aquí están los números ordenados de forma descendente")
    for (i in (cantidad-1 downTo 0)){
        println(listaNumeros[i])
    }

}