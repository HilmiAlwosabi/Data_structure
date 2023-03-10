
package lab6;

public class Q7 {
    public void clone(DoublyLinkedList m){
        DoublyLinkedList l=new DoublyLinkedList();
        m.header=m.header.getNext();
        while(m.header!=null){
            l.addLast(m.header.getNext());
            m.header=m.header.getNext();
            
        }
    }
    
}
