package com.example.kotlindersleri.nesne_tabanli_programlama

class Odev2 {
    // 1. Dereceyi Fahrenheit'a çeviren metod
    fun fahrenhietCevirme(celsius: Double): Double {
        return celsius * 1.8 + 32
    }

    // 2. Dikdörtgenin çevresini hesaplayan metod
    fun cevreHesabi(length: Double, width: Double): Double {
        return 2 * (length + width)
    }

    // 3. Sayının faktöriyelini hesaplayan metod
    fun faktoriyel(number: Int): Long {
        var result = 1L
        for (i in 1..number) {
            result *= i
        }
        return result
    }

    // 4. Kelime içindeki 'a' harfi sayısını bulan metod
    fun aSayisiBulma(word: String): Int {
        return word.count { it == 'a' || it == 'A' }
    }
    // 1. Kenar sayısına göre iç açılar toplamı hesaplayan metod
    fun icAcilarToplami(sides: Int): Int {
        return (sides - 2) * 180
    }

    // 2. Gün sayısına göre maaş hesabı yapan metod
    fun maasHesabi(daysWorked: Int): Int {
        val hoursWorked = daysWorked * 8
        return if (hoursWorked <= 160) {
            hoursWorked * 10
        } else {
            val regularHours = 160
            val overtimeHours = hoursWorked - 160
            (regularHours * 10) + (overtimeHours * 20)
        }
    }

    // 3. Kota miktarına göre internet ücreti hesaplayan metod
    fun intUcret(dataUsage: Int): Int {
        val baseQuota = 50
        val basePrice = 100
        val extraPricePerGb = 4

        return if (dataUsage <= baseQuota) {
            basePrice
        } else {
            basePrice + (dataUsage - baseQuota) * extraPricePerGb
        }
    }


}