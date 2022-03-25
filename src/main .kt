fun main (){
var person =Human("Sharon",20,40)
    person.eat(25)
println(person.weight)
    person.speak("I like travelling")
    println(person.birthday())
    var user1 =User("Johnny", "Brown", "jonnybrown@gmail.com", 786793456,"jonnhy#12" )
    println (user1.firstName)
    println(user1.email)

//Question 1{
}
class Human(var Name:String , var age:Int, var  weight:Int){
    fun eat(foodweight:Int):Int{
        weight+=foodweight
        println("I am eating $foodweight kg of food")
        return weight
    }
    fun speak(speech:String){
        println("$speech")
    }
    fun birthday():Int{
        age++
        return age
    }
}

//Question 2
data class User(var firstName:String, var lastName:String, var email:String, var phoneNumber:Int , var password:String)
