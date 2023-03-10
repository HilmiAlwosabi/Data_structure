
package lab6;

public class Q1<E> extends DoublyLinkedList{
    
    public Node<E> middle(){
        if(header.getNext()==null) return null;
        Node<E> f = header;
        Node<E> e = trailer;
        Node<E> midd = null;
        while (f.getNext()!=null) { 
                f=f.getNext();
                e=e.getPrev();
                if(f==e)midd= e;
                else if(f.getNext()==e&&e.getPrev()==f)
                    midd= e;   
        }
        System.out.println(midd.getElement());  
        return null;
    }
    public static void main(String[] args) {
        Q1<Integer> a=new Q1();
        a.addFirst(10);
        a.addFirst(10);
        a.addFirst(20);
        a.addFirst(30);
        a.addFirst(40);
        a.addFirst(50);
        a.middle();
        
    }
}

    

