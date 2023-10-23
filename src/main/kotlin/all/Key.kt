package all

import all.CalculatorApp
import all.Conversatoin

class Key {
    var command: String = ""

    fun start2() {
        println("Welcome to my project 'Silas'. ")

        while (command != "exit" ) {
            when(command) {
                "Calculator" -> {
                    val myApp = CalculatorApp()
                    myApp.start()
                }
                "Conversation" -> {
                    val myApp = Conversatoin()
                    myApp.start()
                }
                "" -> {

                }
                else -> {
                    println("Unknown Commend")
                }
            }
            println("------------------------")
            println("Supported Comments 'Calculator' and 'Conversation': " )
            println("Press 'exit' to close the program")
            command = readln()
        }
        println("Program had been closed")
        println("Thank you for using 'Silas'. ")

    }
}