package lab4;
//develop an implementation of the equals method in the context of the SinglyLinkedList class.




public class Q1 {
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof SinglyLinkedList)) return false;
        SinglyLinkedList list = (SinglyLinkedList) o; 
        if (list.size()!= o.size()) return false;
        Node walkA = this.head ; 
        Node walkB = list.head(); 
        while (walkA != null && walkB!= null) {
        if (!walkA.getElement( ).equals(walkB.getElement( ))) return false; 
        walkA = walkA.getNext( );
        walkB = walkB.getNext( );
    }
        return true; 
 }

    
}
