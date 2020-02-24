fun main()
{
    var a : MutableList<Int>? = mutableListOf()
    var n : Int?
    var divisions : Int?
    try
    {
        print("Enter the size of the List: ")
        n = readLine()!!.toInt()
    }
    catch (e: NumberFormatException)
    {
        n = 5
        println("The Input was not of integer type therefore,")
        println("the default size of the list has been set as 5")
        println("Add 5 elements to the list:-")
    }
    for(i in 1..n!!)
    {
        var temp : Int? = 0
        try
        {
            print("Enter element number ${i}: ")
            temp = readLine()!!.toInt()
            a!!.add(temp!!)
        }
        catch (e: NumberFormatException)
        {
            a!!.add(i)
            println("The Input was not of integer type therefore,")
            println("the list has added value \"${i}\" to the list for this demonstration")
        }
    }
    try
    {
        print("Enter the number of divisions you want: ")
        divisions =  readLine()!!.toInt()
    }
    catch (e: NumberFormatException)
    {
        divisions = 2
        println("The number of divisions has been set to 2 as the input was not an integer")
    }
    if(divisions!! >= n!!)
    {
        println(a)
    }
    else
    {
        chunking_substitute(a!!, n, divisions!!)
    }
}


fun chunking_substitute(a : MutableList<Int>, n : Int, divisions : Int)
{
    var result : MutableList<List<Int>>? = mutableListOf<List<Int>>()
    for(i in 0..n-divisions+1 step divisions)
    {
        var tempList : MutableList<Int>? = mutableListOf<Int>()
        for(j in i..i+divisions-1)
        {
            if(j == n)
            {
                break;
            }
            tempList!!.add(a.elementAt(j))
        }
        result!!.add(tempList!!)
    }
    println(result)
}