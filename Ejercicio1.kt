package com.example.myapplication

fun main(args: Array<String>) {
    val numbers = arrayOf<Int>(1,1,1,2,2,2,3,3,3,4,4,4,4,5,5,5,6,6)
    var filteredNumbers = numbers.filterIndexed { index, value -> numbers.indexOf(value) === index }
    println(filteredNumbers)
}