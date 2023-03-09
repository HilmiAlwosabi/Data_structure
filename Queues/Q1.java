/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Queues;

/**
 *
 * @author LENOVO
 */
public class Q1<E> extends ArrayQueue<E>{
    
        public void rotate() {
            if (isEmpty()) System.out.println("Queue is empty");


            E temp = data[f];
            data[f]=data[sz];
            data[sz]=temp;
            }
    
}
