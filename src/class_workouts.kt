class class_workouts {

    // in this module we are going to learn about class , properties , accessing
    var name: String = "THIYAGARAJAN"
    var email: String = " thiyagarajan.cs17@bitsathy.ac.in"
    var role: String = "Explorer and an avid learner"

    fun hello(){
        print("hello : ${name}")
    }

}

    fun main(args:Array<String>) {
        val obj = class_workouts()
        obj.hello()
        println("${obj.name} who is having a mail id ${obj.email} and he is ${obj.role}")
    }
