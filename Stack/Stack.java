/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Stack;

/**
 *
 * @author LENOVO
 */
public interface Stack<E> {
    int size();
    boolean isEmpty();
    void push(E e);
    E top();
    E pop();
    
}
