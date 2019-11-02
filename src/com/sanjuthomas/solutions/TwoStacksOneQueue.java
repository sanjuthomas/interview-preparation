package com.sanjuthomas.solutions;

import java.util.Stack;

/**
 * 
 * @author Sanju Thomas
 *
 */
public class TwoStacksOneQueue {
  
  private Stack<Integer> s1 = new Stack<Integer>();
  private Stack<Integer> s2 = new Stack<Integer>();
  
  public void enQueue(Integer i) {
    
    s1.push(i);
    
  }
  
  public Integer deQueue() {
    if(s2.isEmpty()) {
      while(!s1.isEmpty()) {
        s2.push(s1.pop());
      }
    }
    return s2.pop();
  }
  
  
  public static void main(String[] args) {
    final TwoStacksOneQueue instance = new TwoStacksOneQueue();
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
