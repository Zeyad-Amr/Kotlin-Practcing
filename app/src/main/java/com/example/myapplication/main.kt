package com.example.myapplication

fun main(){

    ///// Data Types /////
    
    /// printing + String ///
    val name:String="Zeyad"
    val nameChar:Char='Z' // or "Zeyad"[0]
    var age:Int=22
    //    name="Ali" // name is val which not editable
    age++ // age is var which can be modified

    /// Num ///
    var intNum:Long=500000000
    val floatNum:Float=1.123456789f
    val doubleNum:Double=1.123456789
    val bool:Boolean=true
    intNum=25

    println("Hello, $name, your age is $age")
    println(intNum)
    println(floatNum)
    println(doubleNum)
    println(doubleNum.toInt())
    println(bool)
    println(nameChar)


    val num:Int=2022
    println(num.toString()+1) //20221
    val str:String="2022"
    println(str.toInt()+1) //2023

}