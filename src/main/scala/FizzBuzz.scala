@main def main: Unit =   
  val fizzBuzzedNumbers =
    for
      n <- 1 until 101
    yield fizzBuzz(n)

  fizzBuzzedNumbers foreach println

def fizzBuzz(i: Int): String =
  (i % 3, i % 5) match
    case (0, 0) => "Fizz Buzz"
    case (0, _) => "Fizz"
    case (_, 0) => "Buzz"
    case _ => i + ""
