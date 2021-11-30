
data class emp(val id : Int, var name : String)

fun main(){
    var emp1 = emp(1, "Manish")

    println(emp1.name)
    emp1.name = "Rohan"
    println(emp1.name)
    println("$emp1") // has a toString method to print

    val emp2 = emp(1,"Rohan")
    println(emp1 == emp2) // emp1.equals(user2)

    val updatedClone = emp1.copy(name = "PropertyChanged")
    println(updatedClone)

    println(updatedClone.component1())
    println(updatedClone.component2())

    val (id,naming) = updatedClone
    println("Id is $id with name as $naming")

}