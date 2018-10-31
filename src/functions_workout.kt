fun main(args: Array<String>){

    //excercise 1 - how to use function
    println("excercise 1:")
    fun square(x: Int):Int{
        return x*x
    }

    println(square(8))

    // ----------
    //excercise 2

    println("excerise 2 function using *any* data type")
    //we can also use any data type because kotlin accepts any type to function and then cast to String
    //implementation
    fun convert(x:Any):String{
        return x.toString()
    }
    println(convert(75))
    println(convert("hello world"))
    println(convert(5.56f))

    // ----------
    //excercise 3
    println()
    println("lets us see the nested functions ")
    fun f(x:Int):Int{
        fun g(y:Int):Int{
            return y * 3
        }
        return 2*g(x)
    }

    println("the value for passing number 7 is ${f(7)}")

    //--------
    //excercise 4
    println(" ")
    println("excercise 4 basic function")
    fun add(x:Int,y:Int): Int {
        return x+y
    }

    val a = 9
    val b = 9

    println("the answer is ${add(a,b)}")

}