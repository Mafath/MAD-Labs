package com.example.tutorial_04_calculator.Models

class Calculator (private val number1:Double, private val number2:Double){
//    fun add():Double{
//        return number1 + number2
//    }

    fun add() = number1 + number2
//    here we are directly assigning the return value to the function name. we dont have to include curly braces and return type in this method
    fun subtract() = number1 - number2
    fun divide() = number1 / number2
    fun multiply() = number1 * number2
}