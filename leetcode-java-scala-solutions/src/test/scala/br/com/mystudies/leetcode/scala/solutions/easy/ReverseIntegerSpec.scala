package br.com.mystudies.leetcode.scala.solutions.easy

class ReverseIntegerSpec extends UnitSpec{
	
  val reverseInt =  new ReverseInteger

  it should "reverse the Int" in {
    reverseInt.reverse(123) should be(321)
    reverseInt.reverse(120) should be(21)
    reverseInt.reverse(-123) should be(-321)
    reverseInt.reverse(1534236469) should be(0)
  }
}
