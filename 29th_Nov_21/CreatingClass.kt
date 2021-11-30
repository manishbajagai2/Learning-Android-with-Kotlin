package com.example.counterapp_1

fun main(){
    var mine = Person("Manish","Bajagai")
    var john = Person()
    var mary = Person(lastName = "buerito")
}

class Person(firstName : String = "John", lastName : String = "Doe"){

    init {
        println("First Name is $firstName and Last name is $lastName")
    }
}