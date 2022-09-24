package com.example.myapplication

fun main(){


    /* DATA TYPES
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

     */


    /// When statement
    val x:Int=101
    when(x){
        1-> println("One")
        2-> println("Two")
        3-> println("Three")
        4-> println("Four")
        5-> println("Five")
        6-> println("Six")
        7-> println("Seven")
        8-> println("Eight")
        9-> println("Nine")
        10-> println("Ten")
        100,1000->println("Multiple of Ten")
        else->println("other")
    }

    // loops
    for(item in 0..10 step 2){ // 0 2 4 6 8 10
        print(item.toString())
        print(" ")
    }
    println()
    for(item in 0 until 10 step 2){ // 0 2 4 6 8 //after until not included
        print(item.toString())
        print(" ")
    }
    println()

    /// NULL
    val num:Int? =null

//    println(num!!.toLong())  //  !! -> not null
    println(num?.toLong()) // ? -> Safe call
    println(num?.toLong()?:4) // ?: ->  Elvis (if num != null return num, if num == num return 4)

}