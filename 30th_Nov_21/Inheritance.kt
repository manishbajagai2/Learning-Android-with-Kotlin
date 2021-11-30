
// Super Class or Parent class or Base class
open class Bike(var name : String, var brand : String){
    open var limit : Double = 10.0
    fun recharge(amount : Double){
        if(amount>0)
            limit += amount
    }
    open fun drive(dist : Double){
        println("Drove bike for a distance of $dist KM with limit $limit")
    }
}

// Sub Class or Child class or Derived class
class ElectricBike(name: String,brand: String, batteryLife : Double) : Bike(name,brand){
    override var limit = batteryLife *3

    override fun drive(dist : Double){
        println("Drove for $dist KM on electricity")
    }
    fun drive(){
        println("Can drive now with limit $limit on electricity")
    }
}

fun main(){
    var bike = Bike("A4","Moto-Gp")
    var ebike = ElectricBike("m32", "Rockstar", 55.5)
    ebike.recharge(20.5)
    bike.drive(22.3)
    ebike.drive(54.2)
    ebike.drive()
}