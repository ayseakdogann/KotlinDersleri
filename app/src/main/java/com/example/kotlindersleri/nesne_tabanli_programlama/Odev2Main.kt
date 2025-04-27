package com.example.kotlindersleri.nesne_tabanli_programlama

fun main() {
    val f=Odev2()
    println("Fahrenheit: ${f.fahrenhietCevirme(25.0)}")
    println("Cevre: ${f.cevreHesabi(5.0, 10.0)}")
    println("Faktoriyel: ${f.faktoriyel(5)}")
    println("a harfi sayiyi: ${f.aSayisiBulma("Ankara")}")
    println("ic acilar toplami: ${f.icAcilarToplami(5)}")       // Örn: 540
    println("Maas: ${f.maasHesabi(22)} ₺")                             // Örn: 1840 ₺
    println("internet faturasi: ${f.intUcret(60)} ₺")
}
