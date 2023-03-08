
package Stack;
import java.util.Stack;

public class Q1AndQ2  {
    /* Implement a method with signature transfer(S, T) that transfers all
    elements from stack S onto stack T, so that the element that starts at
    the top of S is the first to be inserted onto T, and the element at the
    bottom of S ends up at the top of T.
    */

    public static Stack<Integer> rev(Stack<Integer> S, Stack<Integer> T){
        while (!S.isEmpty()) {
            T.push(S.pop());
            
        }
        return T;
    }
    //Q2. Give a recursive method for removing all the elements from a stack.

    public static Stack<Integer> recursive(Stack<Integer> S){
        while (!S.isEmpty()) {
            S.pop();
        }
        return S;
    }
    
    public static void main(String[] args) {
        Stack<Integer> S=new Stack<>();
        Stack<Integer> T=new Stack<>();
        for (int i = 1; i <= 5; i++) {

            S.push(i); 

        }
        System.out.println("befor stack => "+S);
        
        System.out.println("after stack => "+rev(S,T)); 
        System.out.println("Stack after removing all the elements => "+recursive(S));
    }
}
