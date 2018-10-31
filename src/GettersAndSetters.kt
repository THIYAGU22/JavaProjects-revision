class user{
    var age : Int = 0
    set(value) {
        if(value>0){ // if the value is negative it will take it as zero
            field = value  // else it will update the value to field which is nothing but your local variable age
        }
    }
    fun printInfo(){
        println("the user age is $age years old")
    }


}
fun main (args:Array<String>){
    val obj = user()
    obj.age= -12
    obj.printInfo()
    obj.age=55
    obj.printInfo()
}