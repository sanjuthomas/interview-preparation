package com.sanjuthomas.solutions;

public class ReverseLinkedList {

  static class Node<T> {
    private T data;
    private Node<T> next;
    public Node(final T data, final Node<T> next) {
      this.data = data;
      this.next = next;
    }

    public static <T> Node<T> reverse(final Node<T> node) {

      Node<T> current = node;
      Node<T> previous = null;
      Node<T> next;

      while(current != null) {
        next = current.next;
        current.next = previous;
        previous = current;
        current = next;
      }
      return previous;
    }

    public static <T> void print(final Node<T> node) {
      System.out.println(node.data);
      if(node.next != null) {
        print(node.next);
      }
    }
  }

  public static void main(String[] args) {
    Node<Integer> node = new Node<>(1, new Node<Integer>(2, new Node<Integer>(3, null)));
    Node.print(node);
    System.out.println("*****************");
    Node<Integer> reversed = Node.reverse(node);
    Node.print(reversed);
  }
}
