fun main(args:Array<String>){
    println("Hello world ${args[0]}")

    //calling the function
    printHello()

    greetings(fname = "Jane")
    drive(fspeed = "slow")
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