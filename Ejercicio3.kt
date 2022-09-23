package com.example.myapplication

fun main(args: Array<String>) {

    println("..::Seleccionador de Outfit::..")
    print("Escribe la temperatura en c°: ")
    val temperatura = readLine()?.toInt()
    println(seleccionarOutfit(temperatura))

}

fun seleccionarOutfit(temperatura: Int? = 0): String {

    if (temperatura!! <= 10) return "Usa un Abrigo hace frío"

    if (temperatura!! > 10 && temperatura!! <= 20) return "Te irá bien si usas una Chaqueta, el clima es templado"

    return "Es mejor que lleves algo ligero, hace calor"
}