val condition1:Boolean = true
val ourString = "sausages"
if(condition1)
{

  println(s"I am happy $condition1")
}
else{
  println("I am very unhappy")
}

(condition1,ourString) match{
  case (true,"sausages") => println(" I am true case")
  case (false,"") => println("I am false case")
  case _ => println("unsure")
}
condition1 match{
  case (true) if(ourString=="sausages") => println(" I am true case")
  case (false) => println("I am false case")
  case _ => println("unsure")
}

val condition2:Int = 99
val condition3 :Int=>Boolean = (g:Int) => g<80 && g>=70

if(condition2<50 ){
  println ("Fail")
}
else{
  if(condition2>=50 && condition2< 60) println("E")
  else if (condition2>=60 && condition2 < 70) println("D")
  else if (condition2>=70 && condition2 <80) println("C")
  else if (condition2>=80 && condition2 <90) println("B")
  else   println("A")
}

condition2 match {
  case g if(condition3(g)) =>println("C")
  case g if(g<90 && g>=80) => "B"
  case g if (90 to 100).contains(g) => "A"
  case g if (60 to 70).contains(g) => "D"
    println(g)
}




val age:Int =19
if(age>= 18)
  {
    List(1,"pf","12a")
  }



