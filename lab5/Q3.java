/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5;

/**
 *
 * @author HP
 */
public class Q3 <E>{
    
    public boolean equals(CircularlyLinkedList<E> List1,CircularlyLinkedList<E> List2) {
    if (List1.size() != List2.size()) {
        return false;
    }
    
    Node<E> walkA = List1.head;
    Node<E> walkB = List2.head;

    while (walkA != null) {
        if (!walkA.getElement().equals(walkB.getElement())) {
            return false;
        }

        walkA = walkA.getNext();
        walkB = walkB.getNext();
    }

    return true;  // lists are equal if we reach this point 
}
    
    
    
}
