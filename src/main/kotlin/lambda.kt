fun main() {
    //lambda-these are functions with no names


    var dirtlevel = 20
    var waterfilter = { level: Int -> level / 2 }
    println(waterfilter(dirtlevel))


       // var result = addnumbers(3, 5)
        //println(result)

    var word ={msg:String-> msg}
    var outout = word("dark")
    println(outout)

    //higher order functions
    var addnumbers = { a:Int, b: Int->a + b}
    fun higherfunctions(lmbd:(Int,Int)->Int){
        var result=lmbd(2,5)
        println("the result for the higher function is $result")
    }

    //passing the lambda
    higherfunctions(addnumbers)
    fun encode(msg:String, encode:(String)->String):String{
        return encode(msg)
    }
    val enc1:(String)-> String ={input -> input.toUpperCase()}
    println(encode("abc",enc1))


    fun enc2(input:String): String = input.reversed()
    println(encode("abc", ::enc2))
    //the operator :: lets kotlin know you are passing the  argument




    }





