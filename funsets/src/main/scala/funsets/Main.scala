package funsets

object Main extends App {
  import FunSets._
  println(contains(singletonSet(1), 1))
   println(FunSets.exists((x:Int) => x%2==0, (x:Int) => x==1000000))
}
