package com.sanjuthomas.solutions.two.sum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/two-sum/
 * o(n) time and o (n) space
 */
public class Solution {

  public static int[] twoSum(final int[] input, final int target) {
    final Map<Integer, Integer> inputMap = new HashMap<>();
    for (int i = 0; i < input.length; i++) {
      final int current = input[i];
      final int result = target - current;
      if (inputMap.containsKey(result)) {
        return new int[]{inputMap.get(result), i};
      }
      inputMap.put(current, i);
    }
    return new int[] {};
  }

  public static void main(String[] args) {
    System.out.println(Arrays.toString(twoSum(new int[]{1, 2, 3, 4, 5}, 6)));
    System.out.println(Arrays.toString(twoSum(new int[]{5, 2, 3, 1, 7}, 12)));
    System.out.println(Arrays.toString(twoSum(new int[]{5, 2, 3, 1, 7}, 16)));
  }
}
