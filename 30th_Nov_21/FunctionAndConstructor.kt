class Person(firstName : String = "Tom", lastName : String = "Hardy"){
    // properties
    var age : Int? = 22
    var hobby = "singing"
    var firstName : String? = null
    // methods
    fun stateHobby(){
        println("$firstName\'s hobby is $hobby")
    }
    init{ // primary constructor
        this.firstName = firstName
        println("I am $firstName $lastName")
    }
    constructor(firstName: String,lastName: String, age : Int)
            :this(firstName,lastName){ // secondary constructor
        this.age = age
        println("I am $firstName $lastName aged $age")
    }
}

fun main(){
    //var obj = Person("Manish", "Bajagai")
    var obj1 = Person("Manish", "Bajagai", 22)
    obj1.stateHobby()
    // obj.stateHobby()
    // var obj2 = Person(lastName = "Holland")
    // obj2.hobby = "dancing"
    // obj2.stateHobby()
    // var obj3 = Person()
}