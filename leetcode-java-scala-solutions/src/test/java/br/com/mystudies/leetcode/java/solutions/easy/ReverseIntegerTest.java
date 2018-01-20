package br.com.mystudies.leetcode.java.solutions.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ReverseIntegerTest {

	private ReverseInteger reserseInteger = new ReverseInteger();;

	@Test
	public void test() {
		assertEquals(reserseInteger.reverse(-123), -321);
		assertEquals(reserseInteger.reverse(123), 321);
		assertEquals(reserseInteger.reverse(120), 21);
		assertEquals(reserseInteger.reverse(1534236469), 0);
	}
}
