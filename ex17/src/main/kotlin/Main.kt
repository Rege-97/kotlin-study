fun main(args: Array<String>) {

    // Lambda Expression
    // 값처럼 다룰 수 있는 익명함수

    // 익명 함수
    val sayHello = fun() { println("Hello!") }
    sayHello()

    // 기본 람다식
    val squareNum: (Int) -> (Int) = { num -> num * num }

    // 타입 생략 가능
    val squareNum2 = { num: Int -> num * num }

    // 파라미터가 1개면 it 사용 가능
    val squareNum3: (Int) -> (Int) = { it * it }

    println(squareNum(30))
    println(squareNum2(30))
    println(squareNum3(30))

    fun invokeLambda(lambda: (Int) -> Boolean): Boolean {
        return lambda(5)
    }

    val falseValue = invokeLambda({ num -> num == 10 })
    val trueValue = invokeLambda({ num -> num < 10 })

    invokeLambda({ it < 10 })
    invokeLambda() { it < 10 }
    invokeLambda { it > 10 }
}