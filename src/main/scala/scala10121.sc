object Numbers {
  val x = 10
  val y = 20
  val z = 30
}

object Calculator{
  import Numbers._
  def addXAndY(x: Int,y:Int):Int ={
    val x =100
    x+Numbers.y
  }

Calculator.addXAndY(1,Numbers.z)
}

