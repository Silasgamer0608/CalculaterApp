package all

import all.Key

class Key2 {
    var commend: String = ""

    fun start3() {
        println("Please enter your password")

        while (commend != "exit") {
            when(commend) {
                "2008" -> {
                    val myApp = Key()
                    myApp.start2()

                }
                "" -> {

                }
                else -> {
                    println("Wrong password! ")
                }
            }
            println("------------------------")
            println("Press 'exit' to stop the program. ")
            commend = readln()

        }
        println("App had been closed")
        println("Thank you for using 'Silas'.")
    }
}