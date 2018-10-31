fun main(args: Array<String>){

    // basic access of arrays - ex 1
    println("excersise 1")
    var array= arrayOf(1,2,3,4)
    //like other languages we can access by its indices
    println(array[0])
    println(array[1])

    // ------------------

    // ex 2 ranges  here .. will consists of the numbers from 2 to 9 .. will consists the between from number _ to number
    println("excercise 2")
    var my_range = 1..10
       //like js we can access and iterate inside local variable x
    for(x in my_range){
        println(x)
    }

    // ------------------

    // ex 3 -- step keyword it is used to step over from intialized variable ( example you use in your loop i.e for incrementing)
    println("excercise 3")
    var even_range = 0..10 step 2
    for(x in even_range){
        println(x)
    }

    //------
    //ex 4 -- basic ranges excersice
    // what is range?
    // it has both start and end value
    println("excercise 4")
    var range = 1.rangeTo(10) // --> will consist from 1 to 10
    println(range)

    var range1 = 8.downTo(1) // --> will consists of  8,7,6,....1
    println(range1)

    var myRange = 1..10
    if(5 in myRange){
        println("5 is in the range")
    }

    //-------------

    //ex 5 using loop with arrays

    println()
    println("excercise 5")
    var nums:IntArray = intArrayOf(4,5,-5,8)
    for(n in nums){
        println(n)
    }

    println()

    var index : Int = 0
    while(index < nums.size){
        println("value at $index : ${nums[index]}")
        ++index
    }

    println()
    println("now gonna print using array indices using for loop")
    for(ix in nums.indices){
        println("value at $ix : ${nums[ix]}")
    }

    //-----------
    //ex 6 practice
    println("excercise 6")
    var number : DoubleArray = doubleArrayOf(1.1,2.2,3.3,4.4,5.5)

    var ans : Double = 0.0

    for(ix in number.indices){
        ans += number[ix]
    }
    println("the answer is $ans")

}