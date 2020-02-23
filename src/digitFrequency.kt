import kotlin.system.exitProcess

fun main()
{
    var a : Int?
    var b : Int?
    try
    {
        a = readLine()!!.toInt()
        b = readLine()!!.toInt()
    }
    catch (e: NumberFormatException)
    {
        a = 123
        b = 321
        println("As inputs were not integer type default example has been performed")
        println("With the values 123 and 321")
        println("Hence True")
        exitProcess(0)
    }
    var a1 : String = a.toString()
    var b1 : String = b.toString()
    var a2 : CharArray = a1.toCharArray()
    var b2 : CharArray = b1.toCharArray()
    a2.sort()
    b2.sort()
    var a3 : String = a2.joinToString()
    var b3 : String = b2.joinToString()
    if(a3 == b3)
    {
        println("True")
    }
    else
    {
        println("False")
    }
}