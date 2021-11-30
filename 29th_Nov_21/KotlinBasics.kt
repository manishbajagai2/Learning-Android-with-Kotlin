package com.example.counterapp_1

fun main(){

    val name : String = "Manish" // immutable variable
    var weight : Int = 67 // mutable string
    var address = "Delhi" // type inference
    // println(name + " lives in " + address) //string concatenation
    // println("$name's weight is $weight") // string interpolation

    // Data Types of Numbers :-

    val myByte : Byte = 10 // 8 bit
    val myShort : Short = 111 // 16 bit
    val myInt : Int = 1212121 // 32 bit
    val myLong : Long = 12345678912345678 // 64 bit
    val alsoLong = 12_345_678_912_345_678L // for readability purpose(_), L - Long( literal constants)
    var myFloat : Float = 123.234f // 32 bit (f or F as suffix to denote floating number as by default its double)
    var myDouble : Double = 143432.123123212123 // 64 bit
    // print("$myByte, $myShort,$myInt, $myLong, $alsoLong, $myFloat, $myDouble")

    // Data Types - bool, char, string :-

    var isRaining : Boolean = true // has values only true or false ( 1 and 0 are not true and false respectively)
    isRaining = false
    var myChar : Char = '$' // cannot have more than one sign or value
    myChar = '1'
    myChar = 'A'
    var myString = "I am a string" // combination of characters or more than one char
    // print("$isRaining, $myChar, $myString")

    // More on String :-

    // println("First character is ${myString[0]}") // expression is enclosed within curly braces
    // println("Last character is ${myString[myString.length - 1]}") // expression is enclosed within curly braces
    // println("Is it empty? : ${myString.isEmpty()}")
    // println("A part of string : ${myString.substring(7,10)}")
    // println("In Uppercase : ${myString.uppercase()}")

    // Arithematic Operators - (+ , - , * , / ,%) :-

    var a = 3; var b = 1
    var result = (a+b)*(a-b)
    // println("value of result is $result")
    result = result + (5 % 3)
    // println("result is $result")
    // Importance of type -
    var res1 = result / 3
    var res2 = result.toDouble() / 3
     // println("Since result was Int, res1 is $res1")
     // println("Now result is Double so, res2 is $res2")


    // Comparison Operators - ( ==, != , < , >, <= , >= ) :-

    var x = 5; var y = 4
    // println("$x is equal to $y ---> ${x == y}")
    // println("$x is not equal to $y ---> ${x != y}")
    // println("$x is less than $y ---> ${x < y}")
    // println("$x is greater than or equal to $y ---> ${x >= y}")

    // Assignment Operator ( +=, -=, /= , *=, %= ) and Increment or Decrement Operations ( i++, i--, ++i, --i)

    var i = 5; var j = 6
    i %= 2
    j /= 2
    // println("Value of i is $i and j is $j")
    i += 2
    j -= 2
    // println("Value of i is $i and j is $j")
    var res = i++ + ++i
    // println("After post and pre increment, res is $res")
    // println("Value of i is $i")
    res = i-- - --i
    // println("After post and pre decrement, res is $res")
    // println("Value of i is $i")

    // Conditional Statement - if, else if, else

    /* if(!true)   print("if am true am executed") else    print("if am false am executed") */
    var mark = 20
    /*
    if(mark>20) println("mark is above 20, excellent !")
    else if(mark < 20){
        var needed = 20 - mark
        println("your mark is $mark, now you need $needed to score 20")
    }
    else    println("wow mark is exactly 20")
    */

    // when statement

    var day = 7
    /*
    when(day){
        1 -> {println("Its Monday")}
        2 -> {println("Its Tuesday")}
        in 3..5 ->{print("Between Wednesday and Friday (both included)")} // .. denotes range of values
        in 7 downTo 6 -> {
            println("Hurray holiday !")
            println("Its Sunday or Saturday")
        }
        else->{println("Invalid Input")}
    }
    */
    var t : Any = 12.55f
    /*
    when(t){
        is Int ->{println("It is an Int")}
        is Double -> {println("Is Double")}
        !is String -> {println("Its not String")}
        is Float -> {println("It is a Float")}
        else -> {println("It is something else")}
    }
    */

    // Loops - (while, do while, for)

    /*
    var n = 1
    while(n<=10){
        print("$n ")
        n++
    }
    println()
    do{
        print("$n ")
        n--
    }while(n>=1)
     */

    // More on while loop

    var status = "fail"
    var marks = 35
    /*
    while(status == "fail"){
        marks++
        println("Increasing the mark")
        if(marks >=40){
            status = "pass"
            println("Finally you are Pass now")
        }
    }
    */
    var v = 1
    /*
    for(v in 1..10){
        print("$v ")
    }
    println()
    for(v in 1.until(10).step(3)){ // or simply for(v in 1 until 10 step 3)
        print("$v ")
    }
    println()
    for(v in 10 downTo 1 step 2){
        print("$v ")
    }
    */

    // Functions

    // Function Argument
    println(addingInt(5,2))
    println(addingInt(5,2, 6))
    println(addingDouble(5.2,2.2))

}
// Function Parameters
fun addingInt( a: Int, b: Int) : Int {
    return a+b
}

fun addingInt( a: Int, b: Int, c:Int) : Double {
    return (a+b)/2.0
}

fun addingDouble( a: Double, b : Double = 6.9) : Double {
    return (a+b)/2
}
