package br.com.mystudies.leetcode.java.solutions.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RomanToIntegerTest {


	private RomanToInteger romanToInteger = new RomanToInteger();

	
	@Test
	public void test() {
		assertEquals(1, romanToInteger.romanToInt("I")); 		
	}

}
