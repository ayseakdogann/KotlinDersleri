package com.example.kotlindersleri.nesne_tabanli_programlama

fun main() {
    val sonuc=5 carp 2//5.carp(2) ->infix yazmazsak böyle yazıcaz
    println(sonuc)
}


infix fun Int.carp(sayi: Int) : Int{
    return this * sayi // this(int)i temsil ediyor
}