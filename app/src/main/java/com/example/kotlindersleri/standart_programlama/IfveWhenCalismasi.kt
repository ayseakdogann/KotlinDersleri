package com.example.kotlindersleri.standart_programlama
//ikinci ders
fun main() {
    val yas=17

    println(yas>=18)

    if(yas>=18){ // true durumundaa calısır
        println("Resitsiniz")
    } else {
        println("resit degilsiniz")
    }
    val ka="admin"
    val s=123456
    val sayi=3
    if (ka=="admin" && s==123456){ // && and(ve),true true ise true olur diger durumlarda false olur
        println("hosgeldiniz")
    }else{
        println("hatali giris")
    }
    if(sayi==9 ||  sayi==10){ // || or(veya) false false ise false diger durumlarda true
        println("sayi 9 veya 10 dur")
    }else{
        println("9 veya 10 degildir")
    }
    // When,diger dillerde Switch olarak bilinir
    val number=5

    when(number){
        1 -> println("sayi birdir")
        2 -> println("sayi ikidir")
        else -> println("tanimlanmiyan sayi")
    }

}