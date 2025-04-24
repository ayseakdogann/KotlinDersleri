package com.example.kotlindersleri.nesne_tabanli_programlama
//data class ne bak
data class Yemekler (var id:Int,var ad:String,var fiyat:Int){
    //Constructor- init fonskiyonu
    // Bu sınıftan nesne oluştugunda calıssın.(init)
    init {
        println("******nesne olustu*****")
    }
    fun bilgiAl(){
        println("----------------")
        println("id: ${id}")
        println("Ad: ${ad}")
        println("Fiyat: ${fiyat}")
    }
    // this: bulundugu sınıfı temsil eder.Swift dilinde self
    // super: kalıtım ile bir üst sınıfı temsil eder
}