
package lab6;

public class Q4<E> {
    public void concatenating(DoublyLinkedList m,DoublyLinkedList l){
        while(!m.isEmpty()){
            l.addLast(m.removeFirst());  
        }
    } 
}
