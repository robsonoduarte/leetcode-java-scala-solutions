package br.com.mystudies.leetcode.scala.solutions.easy

class TwoSum {

  def twoSum(nums: Array[Int], target: Int): Array[Int] = {
      for(i <- 0 until nums.length){
        for(j <- i + 1 until nums.length){
          if(nums(i) + nums(j) == target){
            return Array(i,j)
          }
        }
      }
      Array(0,0)
  }
}



object TwoSum{
  def apply() = new TwoSum()
}