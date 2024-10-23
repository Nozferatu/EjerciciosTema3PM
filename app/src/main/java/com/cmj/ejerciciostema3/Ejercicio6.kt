package com.cmj.ejerciciostema3

fun main(){
    var lista = intArrayOf(3, 1, 5, 2, 13)
    println("Lista normal: ${lista.toList()}")
    var listaInversa = invertirArray(lista)
    println("Lista invertida: ${listaInversa.toList()}")
}

fun invertirArray(listaNumeros: IntArray): IntArray{
    return listaNumeros.reversedArray()
}