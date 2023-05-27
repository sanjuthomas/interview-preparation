package com.sanjuthomas.solutions;

public class MiddleOfTheList {

  public static class Node<T> {
    private T data;
    private Node<T> next;

    public  Node(final T data) {
      this.data = data;
    }

    @Override
    public String toString() {
      final StringBuilder sb = new StringBuilder("Node{");
      sb.append("data=").append(data);
      sb.append(", next=").append(next);
      sb.append('}');
      return sb.toString();
    }
  }

  public static <T> T middle(Node<T> head) {

    if(null == head) return null;
    if(null == head.next) return head.data;

    Node<T> slowMoving = head;
    Node<T> fastMoving = head;

    while(fastMoving != null && fastMoving.next !=null) {
      slowMoving = slowMoving.next;
      fastMoving = fastMoving.next.next;
    }
    return slowMoving.data;
  }

  public static void main(String[] args) {
    Node<Integer> head = new Node<>(0);
    Node<Integer> one = new Node<>(1);
    Node<Integer> two = new Node<>(2);
    Node<Integer> three = new Node<>(3);
    Node<Integer> four = new Node<>(4);

    head.next = one;
    one.next = two;
    two.next = three;
    three.next = four;
    System.out.println(head);
    System.out.println(middle(head));
  }
}
