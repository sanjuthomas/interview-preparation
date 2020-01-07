package com.sanjuthomas.solutions;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;

public class FirstUniqueCharacter {

  public Character firstUniqueCharacter(String input) {

    if(null == input) {
      return null;
    }

    final Map<Character, Integer> countMap = new LinkedHashMap<Character, Integer>();

    for(int i = 0; i < input.length(); i ++ ) {
      final Character c = input.charAt(i);
      if(countMap.containsKey(c)) {
        int count = countMap.get(c) + 1;
        countMap.put(c, count);
      } else {
        countMap.put(c, 1);
      }
    }

    final Optional<Entry<Character, Integer>> entry = countMap.entrySet().stream().filter(e -> e.getValue() == 1).findFirst();
    if(entry.isPresent()) {
      return entry.get().getKey();
    }
    return null;
  }

  public static void main(String[] args) {
    System.out.println(new FirstUniqueCharacter().firstUniqueCharacter("efficient"));
  }

}
