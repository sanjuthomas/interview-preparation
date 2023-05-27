package com.sanjuthomas.solutions;

public class LongestSubstring {

  public static void main(String[] args) {

    //sanjuthomas
    //A aronthom as

    System.out.println(longestNonRepeatingSequence("sanjuthomas"));

  }

  static int longestNonRepeatingSequence(final String token) {
    if (null == token || token.isEmpty()) {
      return -1;
    }
    if(token.length() == 1) {
      return 1;
    }
    int result = -1;
    String temp = "";
    for (char c : token.toCharArray()) {
      String current = String.valueOf(c);
      if (temp.contains(current)) {
        temp = temp.substring(temp.indexOf(current) + 1);
      }
      temp = temp + current;
      result = Math.max(temp.length(), result);
    }
    return result;
  }
}
