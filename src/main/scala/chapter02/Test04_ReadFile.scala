package chapter02

import scala.io.Source

object Test04_ReadFile {
  def main(args: Array[String]): Unit = {
    //1.从文件读取数据
    Source.fromFile("src/main/resources/test.txt").foreach(print)
    val a : Char = 'c'
  }

}
