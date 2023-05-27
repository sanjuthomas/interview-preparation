package com.sanjuthomas.solutions;

import java.util.HashMap;
import java.util.Map;

public class Trie {

  private static final TrieNode ROOT = new TrieNode();

  public static class TrieNode {

    private Map<Character, TrieNode> children;
    private boolean isLast;

    private TrieNode() {
      this.children = new HashMap<>();
      this.isLast = false;
    }

    @Override
    public String toString() {
      final StringBuilder sb = new StringBuilder("TrieNode{");
      sb.append("children=").append(children);
      sb.append(", isLast=").append(isLast);
      sb.append('}');
      return sb.toString();
    }
  }

  public void insert(final String token) {
    final char[] tokenArray = token.toCharArray();
    TrieNode current = ROOT;
    for (int i = 0; i < tokenArray.length; i++) {
      TrieNode temp = current.children.get(tokenArray[i]);
      if (null == temp) {
        temp = new TrieNode();
        current.children.put(tokenArray[i], temp);
      }
      current = temp;
    }
    current.isLast = true;
  }

  public boolean search(final String token) {
    char[] tokenArray = token.toCharArray();
    TrieNode current = ROOT;
    for (int i = 0; i < tokenArray.length; i++) {
      TrieNode temp = current.children.get(tokenArray[i]);
      if (null == temp) {
        return false;
      }
      current = temp;
    }
    return current.isLast;
  }

  public static void main(String[] args) {
    Trie trie = new Trie();
    trie.insert("abcd");
    trie.insert("abef");
    trie.insert("aBCd");
    trie.insert("ef");
    trie.insert("a");
    System.out.println(trie.search("abcd"));
    System.out.println(trie.search("aBCd"));
    System.out.println(trie.search("abef"));
    System.out.println(trie.search("ef"));
    System.out.println(trie.search("a"));
  }
}
