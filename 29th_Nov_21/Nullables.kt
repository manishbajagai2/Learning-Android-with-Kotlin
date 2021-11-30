package com.example.counterapp_1

fun main(){
    var name1:String = "Manish"
    // name1 = null // Compilation error

    var name2 : String ?= "John"
    name2 = null
    // println(name2)

    // since there is a null so compilation error in the method
    //println(name2?.uppercase())

    var len1 = name1.length
    // println("$len1")
    var len2 = name2?.length  // or you can use conditional expression instead of ?
    /*
    if(name2 != null){
        var len2 = name2.length
        println("$len2")
    }else{
        println("null")
    }
    */
    // println("$len2")

    // Elvis Operator ( ?: )

    var name3 : String ?= "John"
    // name3 = null

    var name = name3 ?: "isNull"
    println("name is $name")

    // Not Null Assertion Operator ( !! )

    println(name3!!.uppercase()) // throws exception if null

}