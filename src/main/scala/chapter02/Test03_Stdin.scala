package chapter02

import scala.io.StdIn

object Test03_Stdin {

  def main(args: Array[String]): Unit = {
    //输入信息
    println("请输入名字：")
    val name: String = StdIn.readLine()
    println("请输入年龄：")
    val age: Int = StdIn.readInt()
    println(s"名字是${name},年龄是${age}。")
  }
}
