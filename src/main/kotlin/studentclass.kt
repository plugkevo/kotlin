class students{
    var fname =""
    var age = 0
    var regno = 0

    fun studentsinfo():String{
        return "$fname $age $regno"
    }
}
fun main(){
    //creating an object
    val studentsdetails =students()
    val studentdetaiils2 = students()

    //assigning values
    studentsdetails.fname = "kevin"
    studentsdetails.age = 19
    studentsdetails.regno = 7983

    //assigning for student 2
    studentdetaiils2.fname= "mark"
    studentdetaiils2.age = 20
    studentdetaiils2.regno = 2001

println("the student detail are "+  studentsdetails.studentsinfo())
    println( "The student name is " + studentsdetails.fname + " and the student is aged " + studentsdetails.age + " and his registration number is" + studentsdetails.regno )


// printing for second student
    println("the student details are " + studentdetaiils2.studentsinfo())
}