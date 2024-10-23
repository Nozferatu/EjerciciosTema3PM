package com.cmj.ejerciciostema3

fun main(){
    imprimirNumerosPositivos(15)
}

fun imprimirNumerosPositivos(numero: Int){
    var i = numero

    do{
        println(i)
        i -= 1
    }while(i >= 0)
}