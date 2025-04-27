package com.example.kotlindersleri

fun main() {
    // 1.Compile Error : Kodlama yaparken oluşur
    val sayi=100
    //sayi=500

    //2.Runtime Error (Exceptions)
    val x=10
    val y=0

    try{
        println("sonuc: ${x/y}")
        println("islem tamamlandi")
    } catch (e:ArithmeticException){
        println("ikinci sayi sifir olamaz")
        println(e.message) //hatanin ismini görebiliriz

    }
    
}