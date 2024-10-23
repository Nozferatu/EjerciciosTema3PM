package com.cmj.ejerciciostema3

fun main(){
    println(esPrimo(3))
}

fun esPrimo(numero: Int): Boolean{
    var i = numero / 2

    while(i > 1){
        if(numero % i == 0){
            return false
        }
        i -= 1
    }

    return true
}