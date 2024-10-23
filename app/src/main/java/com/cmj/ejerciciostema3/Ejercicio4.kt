package com.cmj.ejerciciostema3

fun main(){
    var calificacion: Int = 49
    println("Calificación correspondiente a $calificacion: ${evaluarCalificacion(calificacion)}")
}

fun evaluarCalificacion(calificacion: Int): Char{
    if(calificacion in 90..100){
        return 'A'
    }else if(calificacion in 80..89){
        return 'B'
    }else if(calificacion in 60..79){
        return 'C'
    }else if(calificacion in 50..59){
        return 'D'
    }else{
        return 'F'
    }
}