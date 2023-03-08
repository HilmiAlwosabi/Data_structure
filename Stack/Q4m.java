
package Stack;

import java.util.*;

public class Q4m{
    
    
    public static void clone(ArrayStack array){
        ArrayStack S = new ArrayStack(3);
        while(!array.isEmpty()){
            
            S.push(array.pop());
        }    
        while(!S.isEmpty()){
            S.pop() ;
        }    
        
    }
    
    
    
    
}
