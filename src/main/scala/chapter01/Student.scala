package chapter01

class Student (name: String, var age: Int){

  def printInfo: Unit = {
    println(name + " " + age + " " + Student.school)
  }
}

//引入伴生对象
object Student{
  val school: String = "atguigu"

  def main(args: Array[String]): Unit = {
    val alice: Student = new Student("alice", 12)
    val bob: Student = new Student("bob", 23)
    alice.printInfo
    bob.printInfo
  }
}
