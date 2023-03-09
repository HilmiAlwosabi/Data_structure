
package Queues;

public class Q2 {

    public static void clone(ArrayQueue<Integer> e){
        ArrayQueue<Integer> m =new ArrayQueue(e.size());
        while (e.isEmpty()) {      
            m.enqueue(e.dequeue());
            
        }
        while (m.isEmpty()) {      
            System.out.println(m.dequeue());
            
        }
        
    }
    public static void main(String[] args) {
        ArrayQueue<Integer> e=new ArrayQueue<>();
        e.enqueue(5);
        e.enqueue(15);
        e.enqueue(25);
        clone(e);
        
    }
}
