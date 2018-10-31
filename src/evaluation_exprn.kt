fun main(args: Array<String>){
    //excersice 1
    var age = readLine()!!.toInt()
    println("your age is $age")

    //ex 2
    var x = 89
    var y = 11
    println("Sum is ${x+y}")

    //ex 3
    var a = 5
    var s1 = "value is $a"
    var s2 = "${s1.replace("is","was")},but now is ${a+2}"
    println(s2)


    //ex 4
    println("enter 3 numbers")
    var num1 = readLine()!!.toInt()
    var num2 = readLine()!!.toInt()
    var num3 = readLine()!!.toInt()
    println("answer is ${num1+num2+num3}")


    //ex 5

    val(g,h)= readLine()!!.split("").map(String::toFloat)
            print("this difference is ${
            if(g>=h){
                g-h
            }
            else{
                h-g
            }
            }")





}