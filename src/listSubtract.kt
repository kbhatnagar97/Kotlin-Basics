fun main()
{
    var a : MutableList<Int> = mutableListOf(1, 2, 3, 4, 5)
    var b : MutableList<Int> = mutableListOf(1, 3, 5)
    subb(a, b)
}
fun subb(a : MutableList<Int>, b : MutableList<Int>)
{
    var result : MutableList<Int> = mutableListOf()
    var h : Int = 0
    for(i in a)
    {
        for(j in b)
        {
            if(i == j)
            {
                h=1
            }
        }
        if(h == 0)
        {
            result.add(i)
        }
        else
        {
            h=0;
        }
    }
    print(result)
}