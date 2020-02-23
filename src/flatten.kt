import kotlin.system.exitProcess

fun main()
{
    var a : List<*> = listOf<Any>(1,2,3, listOf<Any>(4,5,listOf<Int>(6,7)),8,9, listOf<Int>(10))
    println("Demonstration of flatten() function")
    println("The list was made using \"listOf<Any>(1,2,3, listOf<Any>(4,5,listOf<Int>(6,7)),8,9, listOf<Int>(10))\"")
    println("If you visualise the above code it would look something like this:-")
    println()
    println("1 2 3 4 8 9 10")
    println("       5")
    println("       6 7")
    println()
    println("The objective is to print \"1 2 3 4 5 6 7 8 9 10\"")
    println("Which is what the functionality of flatten() does in kotlin")
    println()
    println("The output has been printed below:-")
    flatten_substitute(a)
}

fun flatten_substitute(a : List<*>)
{
    for(i in a)
    {
        if(i is Int)
        {
            println(i)
        }
        else
        {
            flatten_substitute(i as List<*>)
        }

    }
}


