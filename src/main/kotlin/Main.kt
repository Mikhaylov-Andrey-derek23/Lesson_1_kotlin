import java.lang.reflect.AnnotatedTypeVariable


fun main(args: Array<String>) {
//    classWork()

    homeWork()
}
fun homeWork(){
    println("Home work  25.11")

    fun addTen(variable:Int):Long  {
        return (variable+10).toLong()
    }
    fun divideByTen(variable:Int):Double{
        return  (variable/10).toDouble()
    }
    val resultAddTen = addTen(10)
    val resultDivideByTen = divideByTen(10)
    println("Result of the work function addTen : ${resultAddTen}, type ${resultAddTen::class.java.typeName}\n")
    println("Result of the work function divideByTen: ${divideByTen(10)} type ${resultDivideByTen::class.java.typeName}")

}

fun classWork(){
    println("Hello World!")
    val byteNumber : Byte = -35;
    val uByteNumber: UByte = 255u;

    println("${byteNumber}, $uByteNumber");

    val shortNumber : Short = 10_000;
    val uShortNumber : UShort = 22_000u;

    println("${shortNumber}, ${uShortNumber}");

    val longNumber : Long = 999_9990000;
    val UlongNumber: ULong = 999999999999999999u;

    println("\$longNumber\' ${longNumber}, ${UlongNumber}");

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
//    println("Program arguments: ${args.joinToString()}")

    val floatNumber: Float = 323.143f;
    val doubleNumber : Double = 12121.5222;

    val BoolenVaribal : Boolean = false;

    val charVaribal : Char = '!';

    var sumNumber = 0;
    val firstNumber = 2;
    val secondNumber = 3
    sumNumber = firstNumber +secondNumber
    println("Sum ${sumNumber}")

    fun sum(firstNumber:Int, secondNumber: Int): Int {

        return firstNumber + secondNumber
    }
    val result = sum(7, 3)
    println("Sum result $result")
    println("\n")
    println("Sum function ${sum(2,3)}")

    fun subtract(firstNumber: Int, secondNumber: Int): Int{
        return  firstNumber - secondNumber
    }
    val secondResolve = subtract(100, 25);
    println("\nresolve second $secondResolve \n")
    println("Subtract : ${subtract(100, 45)}\n")

    fun multipleBy(firstNumber: Int, secondNumber: Int): Int {

        return  firstNumber * secondNumber
    }
    println("Result multipleBy ${multipleBy(2,6)}\n")

    fun divideBy(firstNumber: Int, secondNumber: Int): Double {

        return  (firstNumber / secondNumber).toDouble()
    }
    println("Result divideBy ${divideBy(2,6)}\n")
}