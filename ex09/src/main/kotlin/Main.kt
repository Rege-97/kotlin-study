fun main(args: Array<String>) {
    val korea = Korea("Republic of Korea", "Seoul", "Korean")
    korea.singNationalAnthem()

    val usa = USA("United States", "Washington D.C", "English")
    usa.singNationalAnthem()

    korea.printLanguage()
    usa.printLanguage()
}

// 상속을 하기 위해선 open 키워드를 붙여야함
open class Country(val fullName: String, val capital: String, val language: String) {
    fun printFullName() {
        println("Full Name: $fullName")
    }

    fun printCapital() {
        println("Capital: $capital")
    }

    fun printLanguage() {
        println("Language: $language")
    }

    // 메서드에 open 키워드 붙이면 오버라이딩 가능
    open fun singNationalAnthem() {
        println("Start singing")
    }

}

// 상속 시 부모 클래스의 생성자를 뒤에 붙이고 자식 클래스의 생성자는 상수로 선언하면 안됨
class Korea(fullName: String, capital: String, language: String) : Country(fullName, capital, language) {
    override fun singNationalAnthem() { // override 키워드 붙여서 오버라이딩
        super.singNationalAnthem()
        println("Sing Korea national anthem")
    }
}

class USA(fullName: String, capital: String, language: String) : Country(fullName, capital, language) {
    override fun singNationalAnthem() {
        super.singNationalAnthem()
        println("Sing USA national anthem")
    }
}