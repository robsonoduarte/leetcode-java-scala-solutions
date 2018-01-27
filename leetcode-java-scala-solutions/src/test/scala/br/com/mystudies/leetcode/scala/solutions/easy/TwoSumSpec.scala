package br.com.mystudies.leetcode.scala.solutions.easy

class TwoSumSpec extends UnitSpec{

  val twoSum = TwoSum()


  it should "return one array with index when have solution" in {
      twoSum.twoSum(Array(2,7,11,15), 9 ) should be (Array(0,1))
      twoSum.twoSum(Array(2,7,11,15), 26 ) should be (Array(2,3))
      twoSum.twoSum(Array(4,6,8,10), 16 ) should be (Array(1,3))
      twoSum.twoSum(Array(4,5,8,10,11), 19 ) should be (Array(2,4))
  }


  it should "return one array with zerons when don't have solution" in {
	  twoSum.twoSum(Array(2, 7, 11, 15), 15 ) should be (Array(0,0))
  }



}