package all

import Person

class Conversatoin {
    fun start() {
        val people: MutableList<Person> = mutableListOf()

        println("Welcome to MobiLab DB")
        var command: String = ""

        while (command != "exit") {
            when(command) {
                "list" -> {
                    println("Listing people..")
                    println(people)
                }
                "add" -> {
                    println("Adding person..")
                    val newPerson = createPersonFromUserInput()
                    people.add(newPerson)
                }
                "delete" -> {
                    println("Deleting person")
                    val newPerson = createPersonFromUserInput()
                    people.remove(newPerson)
                }
                "" -> {

                }
                else -> {
                    println("Command $command is not supported")
                }
            }

            println("Supported commands: 'list', 'exit', 'add', 'delete': ")
            println("Enter 'run' to continue or 'exit' to stop the program")
            command = readln()
        }

        println("Thank you for using MobiLab DB")
    }

    fun createPersonFromUserInput(): Person {
        print("Person id: ")
        val id = readln()

        print("Person name: ")
        val name = readln()

        print("Person age: ")
        val age = readln()

        return Person(
            id = id,
            name = name,
            age = age.toInt()
        )
    }
}