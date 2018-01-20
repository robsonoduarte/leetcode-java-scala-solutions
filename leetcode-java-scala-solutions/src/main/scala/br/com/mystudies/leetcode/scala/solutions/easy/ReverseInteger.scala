package br.com.mystudies.leetcode.scala.solutions.easy

class ReverseInteger {

  def reverse(x: Int) = {
    try {
    	if(x < 0 ){
    		(-x).toString.reverse.toInt.unary_-
    	}else{
    		x.toString.reverse.toInt
    	}
    } catch {
      case t: NumberFormatException => 0
    }
  }


}