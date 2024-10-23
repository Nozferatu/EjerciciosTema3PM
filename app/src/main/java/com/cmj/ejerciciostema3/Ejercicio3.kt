package com.cmj.ejerciciostema3

fun main(){
    println(esMayorQue10YMenorQue20(13, 20))
}

fun esMayorQue10YMenorQue20(a:Int, b:Int): Boolean{
    return (a in 11..19) && (b in 11..19)
}