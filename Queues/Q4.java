
package Queues;
import java.util.Queue;
public class Q4<E> {
    public static void printJosephusPositions(int count, int position) {
        Queue<Integer> queue = new Queue<Integer>();
        for (int i = 0; i < count; i++) {
            queue.enqueue(i);
        }

        while(!queue.isEmpty()) {
            // The eliminated position counted from 1.
            for (int i = 1; i <= position; i++) {
                int eliminatedPosition = queue.dequeue();

                if (i == position) {
                    System.out.print(eliminatedPosition + " ");
                    break;
                }

                queue.enqueue(eliminatedPosition);
            }
        }
    }
    
}
