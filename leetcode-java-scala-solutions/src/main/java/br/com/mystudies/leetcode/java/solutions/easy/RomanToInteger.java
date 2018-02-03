package br.com.mystudies.leetcode.java.solutions.easy;

public class RomanToInteger {

	public int romanToInt(String s) {
		switch (s) {
			case "I":
				return 1;
			default:
				return 0;
		}
	}

}
