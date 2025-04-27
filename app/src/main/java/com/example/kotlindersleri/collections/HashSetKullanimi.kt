package com.example.kotlindersleri.collections

fun main() {
    //HASHSET
    //Tanımlama
    val meyveler=HashSet<String>()
    // Any-> en üst sınıf demek
    //bütün türleri kapsar
    // Java-> object sınıf

    meyveler.add("elma")
    meyveler.add("muz")
    meyveler.add("kiraz")
    println(meyveler)

    meyveler.add("amasya elma")
    println(meyveler)

    val y=meyveler.elementAt(2)
    println(y)
    println("Boyut : ${meyveler.size}") //kac eleman var?

    for(meyve in meyveler){
        println("Sonuc: $meyve")
    }

    for((indeks,meyve) in meyveler.withIndex()){ //swift: enumarated()
        println("$indeks. -> $meyve")
    }

    meyveler.remove("elma")
    println(meyveler)

    meyveler.clear()
    println(meyveler)

}