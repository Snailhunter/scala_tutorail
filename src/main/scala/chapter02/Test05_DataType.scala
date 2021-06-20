package chapter02

object Test05_DataType {
  def main(args: Array[String]): Unit = {
    //(1)自动提升原则
    val a1: Byte = 10
    val b1: Long = 2345L
    val result: Long = (a1 + b1)
    val result1: Int = (a1 + b1).toInt //强制类型转换

    //(2)高精度转低精度，会报错，反之自动类型转换
    val a2: Byte = 10
    val b2: Int = a2
//    val c2: Byte = b2
    val d2: Byte = b2.toByte

    val a3: Int = 130
    val b3: Byte = a3.toByte
    println(b3)
  }

}
