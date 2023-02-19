/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5;

public class CircularlyLinkedList<E> { 

    
  
  // Nested Node class 
    private static class Node<E> {
        private E element;
        private Node<E> next;
        public Node(E element, Node<E> next) {
            this.element = element;
            this.next = next;
        }  

        public E getElement() {
            return element;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
  
    } 
  
  // instance variables of the CircularlyLinkedList 
  private Node<E> tail = null;
  private int size = 0; 
  public CircularlyLinkedList() {} 
  
  // access methods 
  public int size() { 
    return size; 
  } 
  
  public boolean isEmpty() {return size == 0;} 
  
  // returns (but does not remove) the first element 
  public E first() { 
    if (isEmpty()) 
      return null; 
    return tail.getNext().getElement(); 
  } 
  
  // returns (but does not remove) the last element 
  public E last() { 
    if (isEmpty()) 
      return null; 
    return tail.getElement(); 
  } 
  
  // rotate the first element to the back of the list 
  public void rotate() { 
    if (tail != null) 
      tail = tail.getNext(); 
  } 
  
  // adds element e to the front of the list 
  public void addFirst(E e) { 
    if (size == 0) { 
      tail = new Node<>(e, null); 
      tail.setNext(tail); 
    } else { 
      Node<E> newest = new Node<>(e, tail.getNext()); 
      tail.setNext(newest); 
    } 
    size++; 
  } 
  
  // adds element e to the end of the list 
  public void addLast(E e) { 
    addFirst(e); 
    tail = tail.getNext(); 
  } 
  
  // removes and returns the first element 
  public E removeFirst() { 
    if (isEmpty()) 
      return null; 
    Node<E> head = tail.getNext(); 
    if (head == tail) 
      tail = null; 
    else 
      tail.setNext(head.getNext()); 
    size--; 
    return head.getElement(); 
  } 
}
