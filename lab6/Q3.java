/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change obj2 license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit obj2 template
 */
package lab6;

/**
 *
 * @author HP
 */
public class Q3<E> {
    public boolean equals(DoublyLinkedList<E> obj1,DoublyLinkedList<E> obj2) {
    if (obj1== obj2) {
        return true;
    }
    if (obj1== null || obj1.getClass() != obj2.getClass()) {
        return false;
    }
    DoublyLinkedList list = (DoublyLinkedList) obj1;
    if (list.size() != obj2.size()) {
        return false;
    }

    while (obj1.header != null && obj2.header != null) {
        if (obj1.header.getElement() != obj2.header.getElement()) {
            return false;
        }
        obj2.header = obj2.header.getNext();
        obj1.header = obj1.header.getNext();
    }
    return true;
}
    
}
