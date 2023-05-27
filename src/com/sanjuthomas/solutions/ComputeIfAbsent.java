package com.sanjuthomas.solutions;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ComputeIfAbsent {

  public static void main(String[] args) {
    Map<String, List<Integer>> map = new LinkedHashMap<>();
    map.computeIfAbsent("one", v -> new ArrayList<>()).add(1);
    map.computeIfAbsent("two", v -> new ArrayList<>()).add(2);
    map.computeIfAbsent("one", v -> new ArrayList<>()).add(1);
    System.out.println(map);
  }
}
