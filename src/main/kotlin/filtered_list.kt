fun main(){
    var janelist=( 1..30).toList()
    var studentnames = listOf("james", "jane", "mark")
    studentnames=studentnames.filter { it[0]=='j' }
    println(studentnames)


            //lazy filters it holds the result until when needed
    val instruments = listOf("violet", "violin", "guitar")
    var filteredList = instruments.asSequence().filter { it[0] == 'v' }
    var newlist= (filteredList).toList()

    println(newlist)

    //eager filters release the result
    val eager = instruments.filter { it[0] =='v' }
    println("eager" + eager)

    //maps list
    //performs the same transform on every item and returns the list
    val numbers = setOf(1, 2, 3)
    println(numbers.map { it *3 })

    //flatten list
    //returns a single list of all the elememts of nested collections
    val numbersets = listOf(setOf(1, 2, 3,4,5), setOf(3, 6), setOf(2, 9, 4))
    println(numbersets.flatten())


}


