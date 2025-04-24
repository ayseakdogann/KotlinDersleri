package com.example.kotlindersleri.standart_programlama

import androidx.core.util.rangeTo

//ikinci ders

fun main() {
    // 1,2,3
    for (i in 1 .. 3){ // küçük eşittir yapmak için .. koy o oluyor
        println("dongu 1: $i")
    }

    // 10 ie 20 arasında 5 er atsın
    for (x in 10 .. 20 step 5){ // küçük eşittir yapmak için .. koy o oluşuyor
        println("dongu 2: $x")
    }
    //20 ile 10 arasında 5 er azalsın
    for (x in 20 downTo  10 step 5){
        println("dongu 3: $x")
    }
     // 1,2,3
      var sayac=1

      while (sayac < 4){
          println("dongu 4: $sayac")
          sayac++ // sayac=sayac+1
      }
    //1,2,3,4,5
    for (i in 1 .. 5){
        if(i==3){
            break //donguyu durdurur
        }
       println("dongu 5: $i")
    }

    for (i in 1 .. 5){
        if(i==3){
           continue //bulundugu adımı pas gecer
        }
        println("dongu 6: $i")
    }

}