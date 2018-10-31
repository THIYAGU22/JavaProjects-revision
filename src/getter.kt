class getter{
    var age : Int = 0
    get(){
        return field+2 //field is age variable
    }
        set(value) {
            if(value>0){
                field = value  // explanation is given in gettersAndSetters.kt file
            }
        }
    fun printInfo(){
        println("the user age is $age years old")
    }
}
fun main (args:Array<String>){
    val obj = getter()
    obj.age= -12
    obj.printInfo()
    obj.age=55
    obj.printInfo()
}