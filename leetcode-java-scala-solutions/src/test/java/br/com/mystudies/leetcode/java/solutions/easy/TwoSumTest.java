package br.com.mystudies.leetcode.java.solutions.easy;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class TwoSumTest {


	private TwoSum twoSum = new TwoSum();


	@Test
	public void shouldReturnOneArrayWithIndexWhenHaveSolution() {
		assertArrayEquals(new int[] {0,1}, twoSum.twoSum(new int[]{2, 7, 11, 15}, 9));
		assertArrayEquals(new int[] {2,3}, twoSum.twoSum(new int[]{2, 7, 11, 15}, 26));
		assertArrayEquals(new int[] {1,3}, twoSum.twoSum(new int[]{4, 6, 8, 10}, 16));
		assertArrayEquals(new int[] {2,4}, twoSum.twoSum(new int[]{4, 6, 8, 10, 11}, 19));
	}


	@Test()
	public void shouldReturnOneArrayWithTwoZeroWhenDontHaveSolution() {
		assertArrayEquals(new int[] {0,0}, twoSum.twoSum(new int[]{2, 7, 11, 15}, 15));
	}


}
