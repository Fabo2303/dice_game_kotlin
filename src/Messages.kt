fun getPlayerName(): String {
    println("Write your name:")
    println("Default name is 'Doe'")
    val name = readlnOrNull().toString()
    return name.ifBlank { "Doe" }
}

fun greetings(player: Player) {
    println("Welcome, ${player.name}!")
}

fun instructions() {
    println("Instructions:")
    println("Press 's' to start the game")
}

fun finalResult(player: Player, computer: Player) {
    if (player.getPoint() > computer.getPoint()) {
        println("${player.name} wins the game!")
    } else if (player.getPoint() < computer.getPoint()) {
        println("${computer.name} wins the game!")
    } else {
        println("It's a draw!")
    }

    println("Game Over!")
    println("Press '1' to play again")
    println("Press '2' to exit")
    val choice = readlnOrNull().toString()
    if (choice == "1") {
        startGame()
    } else {
        println("Thanks for playing")
    }
}

fun compareDiceResults(playerDiceResult: Int, computerDiceResult: Int, player: Player, computer: Player) {
    if (playerDiceResult > computerDiceResult) {
        player.addPoint()
        println("${player.name} wins the round!")
    } else if (playerDiceResult < computerDiceResult) {
        computer.addPoint()
        println("${computer.name} wins the round!")
    } else {
        println("It's a draw!")
    }
}

fun showPoints(player: Player, computer: Player) {
    player.showPoint()
    computer.showPoint()
}