fun main(args:Array<String>){
    println("Hello world ${args[0]}")

    //calling the function
    printHello()

    greetings("Jane")
    drive(fspeed = "slow")
    student(reg = 1234, sname = "kevin")
    println(double(50))
    val result =sum(5, 8 )
    println(result)

 //result for total
    val total  =add(5, 9)

    // result for area
    println(area(5 , 6 ))



}
// function 2
fun printHello(){

    println("Hello world")
}
fun greetings(fname:String){

    println("hello $fname")

}
// parameter is used to pass information to  function
fun drive(fspeed: String){
    println("Going $fspeed")

}
fun student(reg: Int , sname: String){
    println("student reg number is $reg and name is $sname")

}

fun double(x:Int): Int{
 return x * 2

}

//function that adds two numbers
fun sum(num1:Int, num2:Int):Int{
     return (num1 + num2)
}
fun add(no1:Int, no2:Int)= no1 +no2

// area

fun area(length: Int, width:Int): Int{
    return (length * width)
}