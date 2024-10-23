package com.cmj.ejerciciostema3

fun main(){
    println("Suma de los números 6, 5 y 9: ${sumarNumeros(6, 5, 9)}")
}

fun sumarNumeros(vararg numeros: Int): Int{
    var sumatoria = 0

    for(n in numeros){
        sumatoria += n
    }

    return sumatoria
}