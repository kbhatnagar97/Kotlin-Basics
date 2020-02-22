
fun main()
{
    var n : Int?
    try
    {
        n = readLine()!!.toInt()

    }
    catch (e: NumberFormatException)
    {
        n = 5
    }
    finally
    {
        println("The input was not an integer, hence pyramid of 5 levels is being displayed below.")
    }
    for (i in 1..n!!)
        {
            for (j in 1..n - i)
            {
                print(" ")
            }
            for (k in 1..(2*i-1)) {
                print("#")
            }
            println()
        }
    }
}



//smart casting example
//println("value is $n")
//    if(n is Int && n2 is Int)
//    {
//        println("result:${n+n2}")
//    }
