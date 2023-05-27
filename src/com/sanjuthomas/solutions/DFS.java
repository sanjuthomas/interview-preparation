package com.sanjuthomas.solutions;

public class DFS {

  public static class Node<T> {
    private T data;
    private Node<T> left;
    private Node<T> right;

    @Override
    public String toString() {
      final StringBuilder sb = new StringBuilder("Node{");
      sb.append("data=").append(data);
      sb.append(", left=").append(left);
      sb.append(", right=").append(right);
      sb.append('}');
      return sb.toString();
    }
  }

  public static <T> Node<T> find(Node<T> root, T target) {
    if(root == null) {
      return null;
    }
    if(root.data.equals(target)) {
      return root;
    }
    Node<T> left = find(root.left, target);
    return left != null ? left : find(root.right, target);
  }

  public static void main(String[] args) {

    Node<Integer> root = new Node<>();
    root.data = 10;
    Node<Integer> left = new Node<>();
    left.data = 5;
    Node<Integer> right = new Node<>();
    right.data = 15;
    root.left = left;
    root.right = right;
    System.out.println(root);

    System.out.println(find(root, 15));
  }
}
