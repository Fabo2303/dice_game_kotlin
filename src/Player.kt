class Player(var name: String = "Doe") {
    private var point = 0

    fun addPoint() {
        point++
    }

    fun getPoint(): Int {
        return point
    }

    fun showPoint() {
        println("$name's point: $point")
    }
}