
trait Artillery{
  val numGuns:Int
  val range:BigDecimal
}

trait RenownedDesigner{
  val name:String
  val location:String
}

class Boat {
  val lenght:Int= 0
  val Width:Int = 0
  val topSpeed:Int =0

  def isFasterThan(boat1:Boat):(Boolean,Boat) = {
    ( boat1.topSpeed,topSpeed) match {
    case(a,b) if (a > b) =>( true,boat1)
    case(a,b) if (a < b)=> (false,this)
    }
  }
}

class SailBoat extends Boat  {
  override val topSpeed =250
  val numsails:Int =10
  val hasOars:Int =0
  val canTack:Int =0
}

class MotorBoat extends Boat{
  override val topSpeed =100
  val engineSize:Int =0
  val fuelType:Int =0
}

case class LuxurySailBoat(name:String,location:String,hasJacuzzi:Boolean) extends SailBoat with RenownedDesigner {
  val hasBooze:Boolean = true
}

class LuxurySailBoat1 extends SailBoat with RenownedDesigner {
    override val name = "Anne"
    override val location = "China"
    val hasJacuzzi:Boolean = true
  val hasBooze:Boolean = true
}
class PirateShip() extends SailBoat with Artillery
{
  override val numGuns = 10
  override val range = 10.6
  val numGangPlanks = 3
  def canOutgun( boat1:PirateShip,boat2:PirateShip):PirateShip= {
   // boat1.isInstanceOf[PirateShip] =>{}
    if(boat1.numGuns > boat2.numGuns)
    boat1
    else boat2
    }
  }

class Warship extends MotorBoat with Artillery {
  override val numGuns = 5
  override val range = 6
  val country:String = ""
}

 class  PacerBoat extends MotorBoat with RenownedDesigner {
  override val name = "Elizabeth"
  override val location = "England"
  val sponsor:String = ""
  val quaterMileTime:Int = 0
}



val luxBoat1 = new LuxurySailBoat1
println(LuxurySailBoat("sss","sss1",true).numsails)
println(luxBoat1.name )
println(luxBoat1.hasJacuzzi)

val myBoat =new MotorBoat
val yourBoat = new SailBoat
val result = myBoat.isFasterThan(yourBoat)
println(s"Result ${result._2.topSpeed} is faster")
val pirateShip1 =new PirateShip
val result2= pirateShip1.canOutgun(pirateShip1,new PirateShip)




