package com.sanjuthomas.solutions.first.unique.character;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/first-unique-character-in-a-string/
 * o(n) time and o (n) space
 */
public class Solution {

  public static int nonRepeatingCharacter(final String input) {
    Map<Character, Integer> counterMap = new HashMap<>();
    char[] inputArray = input.toCharArray();
    for (int i = 0; i < inputArray.length; i++) {
      char current = inputArray[i];
      counterMap.put(current, (counterMap.getOrDefault(current, 0) + 1));
    }
    for (int i = 0; i < inputArray.length; i++) {
      if (counterMap.get(inputArray[i]) == 1) {
        return i;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    System.out.println(nonRepeatingCharacter("efficient"));
    System.out.println(nonRepeatingCharacter("keep planet great"));
  }
}
