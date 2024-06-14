
    trait Walker{
      def walk() : Unit = println("Walking")
    }
    trait Swimmer {
      def swim(): Unit = println("Swimming")
    }
    class Dog3 extends Walker with Swimmer {
      def play() : Unit = println("Playing fetch")
    }

    object mixComposition extends App {
      val dog3 = new Dog3
      dog3.walk() //output: Walking
      dog3.swim() //output: Swimming
      dog3.play() //output: Playing
    }