
fun main(){
    var myCar = Car()
    println("init is found later on therefore, owner is ${myCar.owner}")
    println("Car name is ${myCar.carName}")
    myCar.maxSpeed = 200 // we can set here even if we get the value as 300
    // myCar.maxSpeed = -2 // error - set to be greater than 0
    println("Maximum Speed is ${myCar.maxSpeed}")
    // myCar.model = "M3" // setter is private so error
    println("Model is ${myCar.model}") // but getter is accessible even if declared private
}

class Car(){
    lateinit var owner : String

    var carName : String = "bmw"

    get() { // custom getter because by default get() = field
        return field.uppercase()
    }

    var maxSpeed = 300
    set(value){
        field = if(value>0) value else throw IllegalArgumentException("maxSpeed should be greater than 0")
    }

    var model : String = "A1"
    private set // private meaning var model can be used only within the class Car

    init{
        this.model = "M5" // this will work as var model is updated within the scope of the class
        owner = "Manish"
    }
}