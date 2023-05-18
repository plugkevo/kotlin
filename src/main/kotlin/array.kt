fun main(){
    val pets = arrayOf("dog", "cat", "canary")
    println(java.util.Arrays.toString(pets))

    val mix= arrayOf("hats", 1)
    println(java.util.Arrays.toString(mix))

    val animals = arrayOf(" cow", " dog", " cat")
    println((animals)[1])

    //loops with an array

    val students = arrayOf("jane ", "mark ", "brian")
    for (i in students){
        println(i)
    }

    //for range
    for (y in 1..10 )
        println(y)
//range while skipping
    for (y in 1..10 step 2)
        println(y)

    for (x in 20 downTo 5)
        println(x)
}

