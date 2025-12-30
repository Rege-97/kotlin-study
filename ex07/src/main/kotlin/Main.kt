fun main(args: Array<String>) {
    /**
     *  [Collection]
     *  1. List
     *  2. Set
     *  3. Map
     */

    // 1. List
    // 코틀린의 리스트는 get, set 함수가 아닌 배열처럼 []로 접근 가능
    val fruitList = listOf("Apple", "Banana", "Melon")  // 불변리스트
    println("First fruit ${fruitList[0]}")

    val mutableFruitList = mutableListOf("Apple", "Banana", "Melon")  // 가변리스트
    println("First fruit ${mutableFruitList[0]}")

    mutableFruitList[0] = "Strawberry"
    println("New First fruit ${mutableFruitList[0]}")
    println(mutableFruitList)

    mutableFruitList.forEach { fruit ->
        println("My Fruit List : $fruit")
    }
}