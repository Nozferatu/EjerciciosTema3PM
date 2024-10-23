package com.cmj.ejerciciostema3

fun main(){
    var listaNumeros = listOf(4, 7, 1)
    imprimirLista(listaNumeros)
}

fun imprimirLista(listaNumeros: List<Int>){
    listaNumeros.forEach {
        println(it)
    }
}