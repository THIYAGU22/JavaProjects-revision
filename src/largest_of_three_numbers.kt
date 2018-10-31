fun main(args:Array<String>){

    //excercise 1

    println("EX1: this is basic program for finding of 3 numbers using kotlin!")

    println("enter the three numbers separated by space")
    val (a,b,c) = readLine()!!.split(" ")
    println("the largest among $a,$b,$c is ${theLargest(a.toInt(),b.toInt(),c.toInt())}")

    //excercise 2
    println("EX2: this program is for addition for two numbers")

    var x : Int =  5
    var y : Int =  6
    var z : Int =  7

    println(" the sum of $x , $y  is ${getSum(x,y)}")


}
fun theLargest(x:Int,y:Int,z:Int):Int{

    if(x>y && x>z)
        return x
    else if(y>z)
        return y
    else
        return z
}

fun getSum(x:Int,y:Int):Int{
    return x+y
}
