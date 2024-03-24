fun rollDice(): Int {
    return (1..6).random()
}

fun playerTurn(playerName: String): Int {
    var playerDiceResult = 0
    println("$playerName's turn:")
    for (j in 1..2) {
        val diceResult = rollDice()
        println("Dice No $j: $diceResult")
        playerDiceResult += diceResult
    }
    return playerDiceResult
}

fun showDiceGame(player: Player, computer: Player) {
    var round = 1
    while (player.getPoint() < 3 && computer.getPoint() < 3) {
        println("Round ${round++}:")
        // Call playerTurn function for player and computer and compare the results
        compareDiceResults(playerTurn(player.name), playerTurn(computer.name), player, computer)
        showPoints(player, computer)
        println("\n\n\n\n\n")
    }
    finalResult(player, computer)
}

fun startGame() {
    val player = Player(getPlayerName())
    val computer = Player("Computer")
    greetings(player)
    instructions()
    val start = readlnOrNull().toString()
    if (start == "s") {
        showDiceGame(player, computer)
    }
}