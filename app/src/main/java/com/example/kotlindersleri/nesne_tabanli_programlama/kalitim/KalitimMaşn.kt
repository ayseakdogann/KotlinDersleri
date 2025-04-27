package com.example.kotlindersleri.nesne_tabanli_programlama.kalitim

fun main (){
    val hayvan=Hayvan()
    val memeli=Memeli()
    val kedi=Kedi()
    val kopek=Kopek()

    hayvan.sesCikar() //kalitım yok,kendi metoduna erişti
    memeli.sesCikar() // kalıtım var, bir üst sınıfın metoduna erişti
    kedi.sesCikar() //kalıtım var,kendi metoduna erişti
    kopek.sesCikar() //kalıtım var,kendi metoduna erişti

}