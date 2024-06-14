import java.io.FileNotFoundException

object my_scala extends App {
  println("Hello my scala")

  //Types of variable
  val x = 2 //immutable -> final
  var y = 3 //mutable

  //declaring variable with/without types in scala
  private val my_variable: Int = 10
  private var my_var = 12 //when you do this, Scala can usually infer the datatype for you

  //Control structures
  if (my_variable == my_var)
    {
      println("The variables are equal")
    }else if(my_variable > my_var)
    {
      println("My variable is greater than my_var")
    }else
    {
      println("my_var is greater than My variable")
    }

    //the if/else construct returns a value
    var ternary_var = if(my_var > my_variable) my_var else my_variable
    println(ternary_var)

    //match expression
    import  scala.util.Random
    val x: Int = Random.nextInt(10)
    val result =  x match{
      case 0 => "Zero"
      case 1 => "One"
      case _ => "other"
    }
    println(result)

   //try/catch
  try
    println(9 / 0)
  catch {
    case fnfe: FileNotFoundException => println(fnfe)
    case ae: ArithmeticException => println(ae)
    case exception: Exception => println(exception)
  }

  //for loops and expressions
  //for(arg <- args) println(arg)
  for (x <- 0 to 5) print(x+ " ")
  println("")

  val a = for(i <- 0 to 6) yield i * 2
  println(a)

  val fruits = List("apple", "banana", "lime", "orange")
  var fruitslength = for {
    f <- fruits
    if f.length > 4
  }yield f.length
  println(fruitslength)

  //while and do/while
  private var x_while = 5
  while (x_while > 0){
    print(x_while + " ")
    x_while = x_while - 1
  }
  println()

  //Classes
  val person = new Person("Tek")
  println(person.speaker())
  //val cat = new Cat("Dmu")
  //println(cat.speaker())

  //Collections classes
  var my_list = ('a' to 'f' by 2).toList
  println(my_list)

  //Sequence methods
  val nums = (1 to 10).toList
  val names = List("joel", "ed", "chris", "maurice")
  var new_numbers = nums.map(_ * 2)
  var cap_letters = names.map(_.capitalize)
  println(new_numbers)
  println(cap_letters)

  var new_sum = nums.sum
  var new_product = nums.product
  println(new_product)

  //Tuples
  def getAaplInfo() : (String, BigDecimal, Long) = {
    ("AAPL", BigDecimal(123.45), 101202303L)
  }

  var t = getAaplInfo()
  println(t._2)
}


