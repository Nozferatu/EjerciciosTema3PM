package com.cmj.ejerciciostema3

fun main(){
    println(compararTexto("ola", "ola", 3))
}

fun compararTexto(cadena1:String, cadena2:String, opcion:Int): Boolean{
    when(opcion) {
        1 -> {
            return cadena1 == cadena2
        }

        2 -> {
            return cadena1.equals(cadena2)
        }

        else -> {
            println("Opción inválida")
            return false
        }
    }
}