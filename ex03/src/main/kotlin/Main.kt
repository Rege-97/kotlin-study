fun main(args: Array<String>) {

    /**
     * Function Basic Structure
     * +-----------------------------------------------+
     * | fun FUNCTION_NAME ( PARAMETER ) : RETURN_TYPE {
     * |     // CODES TO RUN
     * | }
     * +-----------------------------------------------+
     */

    printStudentInfo("Rege", 100)
    printStudentInfo("abc", 10)
    printStudentInfo("def", 11)

    println(addNum(100, 1000))
}

fun printStudentInfo(name: String, age: Int): Unit {    // return 값이 없으면 void가 아닌 Unit(생략 가능)
    println("Student Name: " + name)
    println("Student Age: " + age)
    println("Welcome!")
}

fun addNum(n1: Int, n2: Int): Int {
    return n1 + n2
}