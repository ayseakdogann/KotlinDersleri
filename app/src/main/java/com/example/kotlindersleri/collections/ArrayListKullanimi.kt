package com.example.kotlindersleri.collections

fun main() {
    //tanımlama
    val meyveler=ArrayList<String>()

    //veri ekleme : en sona ekleme
    meyveler.add("elma")//0.
    meyveler.add("muz")//1.
    meyveler.add("kiraz")//2.
    println(meyveler)

    //Günelleme
    meyveler[1]="yeni Muz"
    println(meyveler)

    //Insert: istediginz bir indekse ekle,digerlerini yana kaydır (digerlerini bozmuyoruz)
    meyveler.add(1,"portakal")
    println(meyveler)

    //okuma
    val m=meyveler.get(3)
    println(m)
    println(meyveler[3])

    println("Boyut: ${meyveler.size}")//toplam kac eleman var?
    meyveler.reverse() // tersten sıralar
    println(meyveler)



    for(meyve in meyveler){
        println("Sonuc: $meyve")
    }

    for((indeks,meyve) in meyveler.withIndex()){ //swift: enumarated()
        println("$indeks. -> $meyve")
    }
    //silme
    meyveler.removeAt(1)
    println(meyveler)

    meyveler.clear()
    println(meyveler)

}
