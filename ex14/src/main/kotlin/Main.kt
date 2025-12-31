fun main(args: Array<String>) {
    val car = Car()
    car.drive()
    car.stop()
    car.destroy()
    car.showMeColor()

    val bike = Bike()
    bike.drive()
    bike.stop()
    bike.destroy()
}

interface Color {
    fun showMeColor()
}

interface Vehicle {
    fun drive()
    fun stop()
    fun destroy() = println("Vehicle is destroyed") // 디폴트가 정의되어 있는 함수는 오버라이딩 안해도 됌
}

// 상속 처럼 옆에 작성하고 생성자는 생략
// 다중 인터페이스는 콤마로 추가
class Car : Vehicle, Color {
    override fun showMeColor() {
        println("Red color")
    }

    override fun drive() {
        println("Car is moving")
    }

    override fun stop() {
        println("Car is stopped")
    }

    override fun destroy() {
        super.destroy()
        println("The vehicle is car")
    }
}

class Bike : Vehicle {
    override fun drive() {
        println("Bike is driving")
    }

    override fun stop() {
        println("Bike is stopped")
    }
}