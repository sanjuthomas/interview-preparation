package com.sanjuthomas.solutions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class ElementIntersection {

  public static String[] findIntersection(final String[] input1, final String[] input2) {
    if (null == input1 || null == input2 || input1.length == 0 || input2.length == 0) {
      return new String[]{};
    }

    final Set<String> firstSet = new HashSet<>(Arrays.asList(input1));
    return Arrays.stream(input2).filter(one -> firstSet.contains(one)).collect(Collectors.toList()).toArray(new String[]{});
  }

  public static void main(String[] args) {
    System.out.println(Arrays.toString(findIntersection(new String[]{"1", "2", "3"}, new String[]{"2"})));
    System.out.println(Arrays.toString(findIntersection(new String[]{"1", "2", "3"}, new String[]{"4"})));
    System.out.println(Arrays.toString(findIntersection(new String[]{"1", "2", "3"}, new String[]{"1", "2", "3"})));
    System.out.println(Arrays.toString(findIntersection(null, null)));
    System.out.println(Arrays.toString(findIntersection(null, new String[]{"2"})));
    System.out.println(Arrays.toString(findIntersection(new String[]{"2"}, null)));
  }
}
