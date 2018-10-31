fun main(args: Array<String>){

    //in this example we can see about null

    var str :  String = "thiyagarajan"
    println("${str.length}")
   // str = null --> you cant override the null value to variable str


    //but you can override and pass the null value the trick is with ? with the data type
    var name : String? ="john mathew"


    println(name?.length)// ?. safe accessing operator
    name = null // here no error will be displayed to the variable name
    println("${name}") // but you cant check the length property here
}
