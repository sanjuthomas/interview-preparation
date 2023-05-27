package com.sanjuthomas.solutions;

import java.util.Stack;

/**
 * 
 * @author Sanju Thomas
 *
 */
public class TwoStacksOneQueue<E> {
  
  private Stack<E> s1 = new Stack<>();
  private Stack<E> s2 = new Stack<>();
  
  public void enQueue(E e) {
    s1.push(e);
  }
  
  public E deQueue() {
    if(s2.isEmpty() && s1.isEmpty()) throw new RuntimeException("Queue is empty");
    if(s2.isEmpty()) {
      while(!s1.isEmpty()) {
        s2.push(s1.pop());
      }
    }
    return s2.pop();
  }

  public static void main(String[] args) {
    final TwoStacksOneQueue<Integer> instance = new TwoStacksOneQueue();
    instance.enQueue(1);
    System.out.println(instance.deQueue());
    instance.enQueue(2);
    System.out.println(instance.deQueue());
    instance.enQueue(3);
    instance.enQueue(4);
    instance.enQueue(5);
    instance.enQueue(6);
    System.out.println(instance.deQueue());
    System.out.println(instance.deQueue());
  }
}
