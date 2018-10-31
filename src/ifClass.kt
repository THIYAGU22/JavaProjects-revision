fun main(args:Array<String>){
    println("if example program \n \n")

    ifExample(1,45)
    ifExample(24,23)
}

fun ifExample(i: Int, i1: Int) {
        var result = if( i >= i1){
            println("if condition is called because $i is greater than $i1")
            true
        }
        else {
            println("else condition is called because $i1 is greater than $i")
            false
        }
    println("the answer is $result")
}
