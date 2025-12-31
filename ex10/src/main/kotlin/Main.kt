fun main(args: Array<String>) {
    val overwatch = Overwatch()

    overwatch.startGame()
    overwatch.printGameName()
}

// abstract 키워드를 붙여서 추상 클래스 구현
abstract class Game {
    fun startGame() {
        println("Start Game")
    }
    // abstract 키워드를 붙여서 추상 함수 구현
    abstract fun printGameName()
}

class Overwatch : Game() {
    override fun printGameName() {
        println("This is Overwatch")
    }
}