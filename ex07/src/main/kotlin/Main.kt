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

    // 2. Set
    // 순서가 없는 중복되지 않는 요소로 이루어진 자료구조

    // 불변 Set
    val immutableNumSet = setOf(1, 1, 2, 2, 3, 3, 3, 4)    // 중복은 제거하고 들어감
    println(immutableNumSet)

    // 가변 Set
    val mutableNumSet = mutableSetOf(1, 1, 2, 3, 3, 4, 5, 6)
    println(mutableNumSet)
    mutableNumSet.add(100)
    mutableNumSet.remove(1)
    println(mutableNumSet)
    println(mutableNumSet.contains(1))

    // 3. Map

    // 불변 Map
    val immutableMap = mapOf("name" to "Rege", "age" to 29, "height" to 178)    // mapOf() - key to value로 맵 저장
    println(immutableMap["name"])   // 메서드 없이 []로 접근 가능
    println(immutableMap["no"])

    // 가변 맵
    val mutableMap = mutableMapOf("name" to "Rege", "age" to 29, "height" to 178)
    println(mutableMap["age"])

    mutableMap["age"] = 30
    println(mutableMap)
    mutableMap.put("hobby", "coding")
    mutableMap.remove("name")
    mutableMap.replace("age", 80)

    println(mutableMap)
}