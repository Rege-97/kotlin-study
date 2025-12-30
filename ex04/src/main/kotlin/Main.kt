fun main(args: Array<String>) {
    /**
     *  String template
     */

    val price = 1000
    val tax = 100

    val originalPrice = "The original price is $price"  // $ + 변수명으로 스트링 템플릿 사용가능
    val taxPrice = "The tax price is ${price + tax}"    // $ + { 수식 } 으로 스트링 템플릿 사용 가능

    println(originalPrice)
    println(taxPrice)
}