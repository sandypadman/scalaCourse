println("Hello world")



val melons = 5*50
val apples = 2*10
var sodas = 6*120
sodas = sodas+apples+melons


val numberOfCheeses = 22

var typesOfCheeses= "cheddar"

typesOfCheeses = "feta"

println(typesOfCheeses)

val lemons = 5*30
val flour = 90*2
val cider = 6*250
var total = lemons+flour+cider
println(s"Total Cost = $total" )

import java.time.LocalDate
val char: Char ='c'
val d: LocalDate = d
val intVar=7
intVar.toDouble
val myString: String = "1"


val method = (myString:String)=> myString
method("dkfdkdfdkd")
val methodConvertToInteger = (myString:String)=> myString.toInt
methodConvertToInteger("1")

val superFunction = method.andThen(methodConvertToInteger)
superFunction("2")

type sausageAndMore = String

val string1:String = "CATCH-22"
val string2:String = "catdog"
val int1:Int = 7
val boolean:Boolean = true
val string3:String = "Yippee ki-yay"
val booleanFalse:Boolean = false
val string4:String = "a11y"
val int2:Long = 314159265359L

class car{
  val window:Int = 5
  val tyres:Int = 4

}

val model1: car=new car();


 class Animals{
   val age:Int = 0
   val sound:String = ""
   val isPredator:Boolean = false
 }

class Mammal extends Animals {
  val bloodType:String =""
  val isHairy:Boolean = true
}

val tiger:Mammal =new Mammal {
  override val age =1
}

class Dog(size:Int, colour:String, isAGoodBoy: Boolean = true) extends Mammal
val poodle = new Dog(250,"white"){
  override val age = super.age
  override val sound = super.sound
}

case class Dog1(size:Int, colour:String, isAGoodBoy: Boolean = true) extends Mammal
val jackRussel = Dog1(100,"black",false)

case class Animals1(age:Int, sound:String)
case class Mammals1(bloodType:String, isHairy:Boolean) extends Animals1(2,"whoof")
case class Dog2(size:Int,colour:String,isGood:String) extends Mammals1("warmblood",true)



val x = Dog2(100,"brown","yes")
val x1= Dog2.apply(100,"brown","yes")
val y = x.copy(100,"brownish","no")

object Animal {
  val age:Int = 0
  val Pi =3.14
}

Animal.age
Animal.Pi

trait Animaltrait {
  val age:Int = 0
  val Pi =3.14
}

object something extends Animaltrait {
  override age:Int =7  
}

class Bird {

}
class Parrot extends Bird{

}
class Eagle extends Bird with predatorTraits {

  override thirsForBlood = 67
}
trait predatorTraits{
  val thirsForBlood = 99
}