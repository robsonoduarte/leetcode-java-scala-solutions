package br.com.mystudies.leetcode.scala.solutions.easy

class ReverseIntegerSpec extends UnitSpec{

  val reverseInteger =  new ReverseInteger

  it should "reverse the Integer" in {
    reverseInteger reverse 123 should be(321)
    reverseInteger reverse 120 should be(21)
    reverseInteger reverse -123 should be(-321)
    reverseInteger reverse 1534236469 should be(0)
  }
}
