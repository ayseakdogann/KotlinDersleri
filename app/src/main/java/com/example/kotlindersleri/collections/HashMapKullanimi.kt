package com.example.kotlindersleri.collections

fun main() {
    //HashMap JSON veri modeline benzemektedir
    //Map,Dictionary(swift)
    //Shared Preferences,DataStore,UserDefault(swift)
    val iller=HashMap<Int,String>()

    //aynı keye birden fazla deger ATAYAMAZSIN
    //farklı keylere aynı degerleri atayabilirsin
    iller.put(16,"bursa")  //ekleme yontemi
    iller[34]="istanbul"  //ekleme yontemi
    iller[6]="ankara"
    println(iller)

    iller[16]="yeni bursa"
    println(iller)

    val il=iller[6]
    println(il)

    println("Boyut: ${iller.size}")

    for((anahtar,deger)in iller){
        println("$anahtar -> $deger")
    }

    iller.remove(34)
    println(iller)

    iller.clear()
    println(iller)
}
