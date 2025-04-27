package com.example.kotlindersleri.nesne_tabanli_programlama

fun main(){
    //nullable,null safety,optional(swift)
    //genellikle mobil uygulama geliştirme dillerinde yer almaktadır.
    //null,NaN,nil
    //1. tanımlama
    var mesaj:String?=null

    mesaj="merhaba"

    //Yöntem 1
    //(?)sorun yoksa calısır,sorun varsa uygulama çökmez
    println("yontem 1: ${mesaj?.uppercase()}")

    val x=mesaj?.uppercase()
    //x.lowercase()

    //Yöntem 2
    //(!!)sorun yoksa calısır,sorun varsa uygulama çöker
    //cok emin oldugunuz kodlarda kullanabilirsiniz.
    println("yontem 2: ${mesaj!!.uppercase()}")

    //yontem 3
    // null kontrol
    if(mesaj!= null){
        println("yontem 3: ${mesaj.uppercase()}")
    }else{
        println("degiskende null yer almaktadir")
    }
    //null kontrol (if else'in prati hali just if)
    mesaj?.let{
        println("yontem 3: ${mesaj.uppercase()}")
    }
}