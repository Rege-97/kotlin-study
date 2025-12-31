fun main(args: Array<String>) {

    val car = Car("Red", "Volvo", 13)
    val car2 = Car("Yellow", "Hyundai", 15)

    val car3 = Car("Blue", "Tesla")
    val car4 = Car("Silver", "Honda")
}

class Car(val color: String, val name: String, val age: Int) {  // 생성자는 매개변수처럼 작성
    init {  // init 함수: 생성 시 실행되는 함수
        println("Color : $color, Name : $name, Age : $age")
    }

    constructor(color: String, name: String) : this(color, name, 12) {   // 보조 생성자(자바의 오버로딩과 비슷) - 반드시 this 호출필요
        println("Secondary constructor is called!")
    }
}