/**
  * Created by hdu on 8/14/17.
  */
class FirstHello {

}

object Main extends App {

  def test(body:  Unit, a : Int) = {
    println ("before it" + a)
    body
    body
  }
  println("Hello, World... Again does that change?")
  test({
    println("this is inside body" )
  }, 123)
}
