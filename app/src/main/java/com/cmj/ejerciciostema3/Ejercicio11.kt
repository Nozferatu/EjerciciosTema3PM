package com.cmj.ejerciciostema3

fun main(){
    imprimirNumerosHastaN(20)
}

fun imprimirNumerosHastaN(numero: Int){
    var i = 1

    do{
        println(i)
        i += 1
    }while(i <= numero)
}