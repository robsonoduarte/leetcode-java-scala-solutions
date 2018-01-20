package br.com.mystudies.leetcode.java.solutions.easy;

public class ReverseInteger {
	public int reverse(int x) {
		try {
			if(x < 0){
				return -Integer.valueOf(toStringReverse(-x));
			}
			return Integer.valueOf(toStringReverse(x));
		} catch (NumberFormatException e) {
			return 0;
		}
	}
	private String toStringReverse(int x) {
		return new StringBuilder(Integer.toString(x)).reverse().toString();
	}
}
