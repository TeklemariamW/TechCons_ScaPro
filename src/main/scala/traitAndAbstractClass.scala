      trait Speaker2 {
        def speak(): Unit // Abstract method
      }
      trait Speaker3 {
        def noSpeak(): Unit // Abstract method
      }

    abstract class Animal2 {
      def makeSound(): Unit // Abstract method
    }

    class Dog2 extends Animal2 with Speaker2 with Speaker3  {
      override def makeSound(): Unit = println("Bark")
      override def speak(): Unit = println("Hello, I'm a dog")
      override def noSpeak(): Unit = println("Nothing to say")
    }

    object myMethod extends App {
      val dog2 = new Dog2
      dog2.makeSound() // Output: Bark
      dog2.speak() // Output: Hello, I'm a dog
      dog2.noSpeak() // Output: Nothing to say
    }
