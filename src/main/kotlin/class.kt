


    class House {
        var color: String = ""
        var noofwindows: Int = 0
        var isforsale: Boolean =false
        //to display output
        fun housedetails():String{
            return "$color $noofwindows $isforsale"
        }
        fun janedetails(): String{
            return "$color $noofwindows $isforsale"
        }
    }
    //behaviour


        fun main(){
            //creating an object
            val myHouse = House()
            val janeHouse = House()
            //assigning the values to our object
            myHouse.color="pink"
            myHouse.noofwindows= 5
            myHouse.isforsale =false

            //object 2
            janeHouse.color ="blue"
            janeHouse.noofwindows =9
            janeHouse.isforsale = true
            // we access the properties using period (.)
            println(myHouse.color)
            println(myHouse.isforsale,)
            println(myHouse.noofwindows)
            //accessing a method using (.)
            println(myHouse.housedetails())
            println(janeHouse.housedetails())
            println(janeHouse.janedetails())
        }

