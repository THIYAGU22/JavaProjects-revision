fun main(args:Array<String>){
    print("string some letters")
    print(78)
    print(78.343)
}

// this is the big advantage of kotlin you can pass any type to function

fun print(args:Any){
        println(args)

        // you can play with this function
        // you can easily find the string length

        if(args is String){
            println("$args is string and its length ${args.length}")
        }


}

