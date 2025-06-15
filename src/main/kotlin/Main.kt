fun main() {
    var number: Long = 23

    val integerMaxValue = Long.MAX_VALUE

    val integerMinValue = Long.MIN_VALUE

    println("Integer max value: $integerMaxValue")
    println("Integer min value: $integerMinValue")

    number = 9223372036854775807

    val byteMaxValue: Byte = Byte.MAX_VALUE
    val byteMinValue: Byte = Byte.MIN_VALUE

    println("Byte min value: $byteMinValue")
    println("Byte max value: $byteMaxValue")

    val shortMaxValue: Short = Short.MAX_VALUE
    val shortMinValue: Short = Short.MIN_VALUE

    println("Short max value: ${shortMaxValue}")
    println("Short min value: ${shortMinValue}")

}