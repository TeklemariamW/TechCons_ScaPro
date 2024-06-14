trait Speaker{
  def speaker() : String
}
trait Player{
  def startPlaying(): Unit = {
    println("Person is playing")
  }
  def stopPlaying(): Unit = {
    println("Person stopped playing")
  }
}
trait Sleep{
  def wakeUp(): Unit = {
    println("Good moring! It is time to wake up.")
  }
  def sleepingTime(): Unit = {
    println("Good night! Time to sleep")
  }
}

class Person(name: String)  extends Speaker with Player with Sleep{
  def speaker() : String = "Hi"
  def printFullName(): Unit = {
    println(s"$name")
  }
}
class Cat(name: String) extends Speaker with Player with Sleep{
  def speaker(): String = "Meow"
}
