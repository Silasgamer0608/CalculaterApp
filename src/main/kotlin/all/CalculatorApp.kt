package all

class CalculatorApp {
    var command: String = ""

    fun start() {
        println("Welcome to Fancy Calculator..")

        while (command != "exit") {
            when (command) {
                "+" -> {
                    val result = addition()
                    println("result is $result")
                }

                "-" -> {
                    val result = supstraction()
                    println("result is $result")
                }

                "*" -> {
                    val result = multiplication()
                    println("result is $result")
                }

                "/" -> {
                    val result = division()
                    println("result is $result")
                }

                "" -> {

                }

                else -> {
                    println("Command $command is not supported")
                }
            }
            println("------------------------")
            println("You can yous commands: '+', '-', '*', '/'")
            println("(Enter 'exit' stop the program)")
            command = readln()
        }
        println("The program has been cloesed")
    }

    fun addition(): Double {
        print("Enter the your first number: ")
        val num1 = readln().toDouble()
        print("Enter the your second number: ")
        val num2 = readln().toDouble()

        return num1 + num2
    }
    fun multiplication(): Double {
        print("Enter the your first number: ")
        val num1 = readln().toDouble()
        print("Enter the your second number: ")
        val num2 = readln().toDouble()

        return num1 * num2
    }
    fun supstraction(): Double {
        print("Enter the your first number: ")
        val num1 = readln().toDouble()
        print("Enter the your second number: ")
        val num2 = readln().toDouble()

        return num1 - num2
    }
    fun division(): Double {
        print("Enter the your first number: ")
        val num1 = readln().toDouble()
        print("Enter the your second number: ")
        val num2 = readln().toDouble()

        return num1 / num2
    }


}

