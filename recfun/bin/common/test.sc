package common

object test {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  val nums1=List(1,2,35,66,2)                     //> nums1  : List[Int] = List(1, 2, 35, 66, 2)
  val nums2=List( 2,5, 1, 3)                      //> nums2  : List[Int] = List(2, 5, 1, 3)
  (nums1,nums2).zipped map (_ * _)                //> res0: List[Int] = List(2, 10, 35, 198)
  
}