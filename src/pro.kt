fun main(args: Array<String>){
   // val test = readLine();
    //println("your input: $test")

    var i1 : Int
    var i2 : Int

    //readLine is used to get the input from the user and it gets typecasted into int
    i1 = readLine()!!.toInt()
    i2 = readLine()!!.toInt()

    // val wont change it is immutable
    val product : Int
    product = i1 * i2;
    println("your answer is $product")

    var objct : Any = 596
    //*any* will accept the value whatever the data type it may be
    var num : Int = objct as Int
    println(num)

}