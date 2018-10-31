fun main(args: Array<String>){

   //excersise if else
    val(g,h)= readLine()!!.split(" ").map(String::toFloat)
    print("this difference is ${
    if(g>=h){
        g-h
    }
    else{
        h-g
    }
    }")


}