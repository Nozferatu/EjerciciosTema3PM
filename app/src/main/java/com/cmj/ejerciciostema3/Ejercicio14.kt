package com.cmj.ejerciciostema3

fun main(){
    println(encontrarPrimoMayorQue100())
}

fun encontrarPrimoMayorQue100(): Int{
    var numero = 0

    for(i in 100..Int.MAX_VALUE){
        if(esPrimo(i)){
            numero = i
            break
        }
    }

    return numero
}