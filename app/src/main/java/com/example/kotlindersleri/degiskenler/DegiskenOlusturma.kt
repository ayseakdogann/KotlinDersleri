package com.example.kotlindersleri.degiskenler

fun main (){
     //değişken tanımlama
    var isim="ayse"
    var harf='a'
    var yas=21
    var boy=159.8
    var bekar=true
    println("isim: $isim") // println("isim:"+isim) ile  eş değerdir.
    println("yas: $yas")
    println("boy: $boy")
    println("bekar: $bekar")
    println("harf: $harf")
     // constant (sabitler)
      var x=6 // var ile tanımladıgımız değşkeni değiştirebiliriz (var, sonradan değişiklik yapılacak anlamına gelir)
      x=7
      println("x: $x")
      val y=6  // val, const la aynı işlemi görür.
      // y=5 val can not reassigned.

    //Tür Dönüşümü
    //1- Sayısaldan sayısala dönüşüm (riskli)
     var sayi=12.5
     var sayi1=sayi.toInt()
     println("sayi1: $sayi1")
     var sayi2=34
    var sayi3=sayi2.toDouble()
    println("sayi3: $sayi3")

   //2-sayısaldan metine dönüşüm
    var a=12 // arayüze bir şey yazdıracakan bu string olmalı (???)
    var kelime=a.toString() // "12"
    println(a)

    //3-metinden sayısala dönüştürme
    var kod="46"
    var c=kod.toInt() // "46" stringini 46 int sayısına cevirdik
    println("kod:$kod")
    val kod2="46t"  // böyle bir şeyi sayıya ceviremeyiz
    val d=kod2.toIntOrNull() // inte cevir olmuyorsa null döndür
    println("d:$d")
   /* if(d!=null){
        println("kod2: $kod2")
    }else{
        println("kod2 nulldur.")
    } */

    /// ikinci ders






}