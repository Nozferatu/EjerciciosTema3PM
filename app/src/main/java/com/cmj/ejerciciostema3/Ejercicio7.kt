package com.cmj.ejerciciostema3

fun main(){
    var listaNombresFrutas: List<String> = listOf("Plátano", "Naranja", "Sandía")
    var listaAux: MutableList<String> = listaNombresFrutas.toMutableList()
    listaAux.add("Melón")
    listaNombresFrutas = listaAux.toList()

    println(listaNombresFrutas)
}