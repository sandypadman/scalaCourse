def getBigVal(input1:Int,input2:Int):String = {

  (input1,input2) match{
    case(a,b) if(a >b ) => "first"
    case(a,b) if(a<b) => "second"
    case _ => "same"
  }

}

getBigVal(23,34)

def nameLength(firstname:String,secondname:String):(Int,String) = {
  (firstname,secondname) match
    {
    case(firstname,secondname) if (firstname.length> secondname.length) => (firstname.length,firstname)
    case(first,second) if (first.length< second.length) =>( second.length,second)
    case _ =>( 0,"")
  }


}

val lenghtOfTheString = nameLength("sandhya","padmanabhan")
println(s"The longest name is ${lenghtOfTheString._1}" )
println(s"The length of the name ${lenghtOfTheString._2}")