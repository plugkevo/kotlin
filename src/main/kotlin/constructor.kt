//constructor
class student (var fname:String, var age:Int, var regno:Int)
//creating an object class
fun main(){
    val std1= student("john", 8, 5500)
    val std2 =student("kevin", 8, 7841)
    println("the first student is " +" "+ std1.fname+ " "+ std1.age + " " + std1.regno)
    println(std2.fname+" "+ std2.age +" "+ std2.regno)



    val person1= person("Ann", "Gathoni", 58258)
    val person2 = person("Joe", "Mirii", 745888)

    println(person2.firstname +" "+ person2.lname +" "+ person2.telno )
    println(person1.firstname+" "+ person1.lname + " "+ person1.telno)
}

class person(var firstname: String,var lname:String, var telno:Long)