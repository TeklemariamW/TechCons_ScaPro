class cat {
  def makeSound() : Unit = println("Cat make sound")
}

class Animal {
  def makeSound(): Unit = println("Generic animal sound")
}
class Dog extends Animal{
  override def makeSound(): Unit = println("Woof!")
}

object myAnimal extends App{
  val dog = new Dog
  dog.makeSound()
}
