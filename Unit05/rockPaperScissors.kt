import kotlin.random.Random

fun main(args: Array<String>) {
    var playAgain = true

    while(playAgain) {
        print("Do you want to play? (1 = Y /2 = N)")
        var play = readLine()?.toIntOrNull()
        if (play == 1) {
            playAgain = true
        } else if (play == 2) {
            playAgain = false
        }
        if (playAgain) {
            println("These are the rules of the game")
            println("Rock is 1")
            println("Paper is 2")
            println("Scissors is 3")

            println("What is your choice?")
            var playerChoice: Int? = readLine()?.toIntOrNull()

            val cpu = Random.nextInt(1, 4)
            println("Computer picks $cpu")

            if ((playerChoice == 1 && cpu == 3) || (playerChoice == 2 && cpu == 1) || (playerChoice == 3 && cpu == 2))
                println("YOU WIN!!!")
            else
                if ((playerChoice == 1 && cpu == 1) || (playerChoice == 2 && cpu == 3) || (playerChoice == 3 && cpu == 1))
                    println("You Lose :'(")
                else
                    if ((playerChoice == 1 && cpu == 1) || (playerChoice == 2 && cpu == 2) || (playerChoice == 3 && cpu == 3))
                        println("You Tie(---)")
                    else println("--->TRY AGAIN<---")
        }
        print("Do you want to play again? (1 = Y /2 = N)")
       play = readLine()?.toIntOrNull()
        if (play == 1) {
            playAgain = true
        } else if (play == 2) {
            playAgain = false
            println("OK, thanks for playing!")
                break
        }
    }
}