package com.example.kotlindersleri.nesne_tabanli_programlama

fun main() {
    //Nesne oluşturma
    val y1=Yemekler(100,"Kofte",249) //burdaki val y1 nesnesini temsil ediyo iç degerleri var old için onlar değişir
    //deger okuma
    y1.bilgiAl()
  // deger atama/değistirmek
    y1.fiyat=350
    y1.bilgiAl()

    val y2=Yemekler(200,"Baklava",300)
    y2.bilgiAl()
    y2.ad="Soguk baklava"
    y2.bilgiAl()
}