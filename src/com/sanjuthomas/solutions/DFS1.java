package com.sanjuthomas.solutions;

import com.sanjuthomas.solutions.DFS.Node;

public class DFS1 {

  public static class Node<T> {
    private T data;
    private Node<T> left;
    private Node<T> right;
  }

  public static void main(String[] args) {
    DFS1.Node<Integer> root = new DFS1.Node<>();
    root.data = 10;
    DFS1.Node<Integer> left = new DFS1.Node<>();
    left.data = 5;
    DFS1.Node<Integer> right = new DFS1.Node<>();
    right.data = 10;
    root.left = left;
    root.right = right;
  }

}
