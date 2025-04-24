package com.example.kotlindersleri.nesne_tabanli_programlama

fun main() {
    val f=Fonksiyonlar()

    //void=unit
    f.selamla1()

    //return
    val gelenSonuc=f.selamla2()
    println("Gelen sonuc: $gelenSonuc")

    //parametre
    f.selamla3("Nimet")
    f.topla(10.2,20.1,"beyza")

}