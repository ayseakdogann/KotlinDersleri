package com.example.kotlindersleri.nesne_tabanli_programlama.kalitim

class Kedi : Memeli() {
    override fun sesCikar() {
        //super.sesCikar() super:kalitim ile üst sınıfı temsil(memeli) eder
        println("miyav miyav")
    }
}