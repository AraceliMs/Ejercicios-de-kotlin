package com.example.myapplication

fun main(args: Array<String>) {

    println("..::Iniciar Sesión::..")
    print("Escribe tu nombre de usuario: ")
    val userWriten = readLine().toString()

    print("Escribe tu password: ")
    val passwordWriten = readLine().toString()

    if (validarCredenciales(userWriten, passwordWriten))
        return println("Bienvenid@ $userWriten")

    return println("Usuario o contraseña incorrectos!")
}

fun validarCredenciales(user: String, password: String): Boolean {
    return user == "Araceli" && password == "12345"
}