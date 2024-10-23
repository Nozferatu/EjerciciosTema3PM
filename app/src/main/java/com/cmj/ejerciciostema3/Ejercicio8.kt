package com.cmj.ejerciciostema3

fun main(){
    var listaColores: MutableList<String> = mutableListOf("Verde", "Morado", "Rojo", "Amarillo")
    listaColores.removeIf { it.equals("Amarillo") }

    println(listaColores)
}