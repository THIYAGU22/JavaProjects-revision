fun main(args: Array<String>) {

    //basic usage of when funtion and its like switch

    //syntax
    /**
     * when(variable)
     * {
     *  condition -> statement
     * }
     */

    val num = 15
    when (num) {
        10 -> println("case1 called")
        15 -> println("case2 called")
        else -> println("default case")
    }

    //example for when ! condition can also be checked inside the block

    var age = readLine()!!.toInt()

    when {
        age < 18 -> println("youre not eligible to vote")
        age > 18 -> println("youre eligible to vote")
        else -> println("no negative numbers")
    }

    var grade = readLine()!!.toInt()

    var result = when{
        grade < 50 -> "failed"
        grade > 50 && grade < 80 -> "good"
        grade < 80 -> "awesome"

        else -> "not satisfactory"

    }
    println(result)
}
