
    class Counter  private(private var count: Int){
      def increment(): Unit = count += 1
      def getCount(): Int = count
    }
    object Counter {
      private val instance = new Counter(0)

      def getInstance: Counter = instance
    }

    object singletonAndCompanion extends App {
      val counter = Counter.getInstance
      counter.increment()
      println(counter.getCount()) //Output: 1
    }

