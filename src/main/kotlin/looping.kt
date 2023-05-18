fun main(){
    val day = 5
    when(day){
        0-> println("")
        1-> println("monday")
        2-> println("tuesday")
        3-> println("wednesday")
        4-> println("thursday")
        5-> println("friday")
        6-> println("saturday")
        7-> println("sunday")
        else-> println("Day does not exist")
    }

    //while loop
    var x=1
    while (x<=10){
        println(x)
        x++
    }

    // do while loop
    var y=5
    do {
        println(y)
        x++
    }
        while (y<5)

        //repeat

        repeat(5) {
            println("kevin")
        }

    val fruits = mutableListOf("oranges", "pawpaw", "mango")
    //removing an item
    fruits.remove("pawpaw")
    //adding an item
    fruits.add("passion")
    fruits[0]= "pineaplle"
    println(fruits)

    var numberofbooks: Int?=null




}