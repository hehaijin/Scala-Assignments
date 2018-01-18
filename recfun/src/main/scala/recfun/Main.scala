package recfun

object Main {
  
  
  
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
   // println("the balance is " +balance(ch))
    println(countChange(4, li))
  }

 
   //  val ch: List[Char]=List('(','}','{')
     val li: List[Int]=List(3)
  
  /**
   * Exercise 1
   */
    def pascal(c: Int, r: Int): Int = {
      if(c==0) 1 else ( if (c==r) 1 else pascal(c-1,r-1)+pascal(c,r-1))
  
    }
  
  /**
   * Exercise 2
   */
    def balance(chars: List[Char]): Boolean = {
     if(chars.isEmpty) true
     else bal(0,chars)
 
    }
  
    def bal(n: Int, chars: List[Char]): Boolean={
      
      if(n <0) false
      else if(chars.isEmpty) {
        if(n==0) true
        else false
      }
      else if (chars.head=='(') bal(n+1, chars.tail)
      else if (chars.head==')') bal(n-1, chars.tail)
      else bal(n,chars.tail)
    }
  
  /**
   * Exercise 3
   */
    def countChange(money: Int, coins: List[Int]): Int = {
      if(money ==0) 1
      else if(coins.isEmpty) 0
      else {
        
        val t=List.range(0,money/coins.head+1)
        (0 /: t) ( (i:Int,j:Int) => i+countChange(money-j*coins.head,coins.tail))
      }
 
    }

  }
