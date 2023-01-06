package DS_Lap3;

import java.util.Arrays;

public class Q3_Q4 {
    public static void main(String[] args) {
        //Q3- Concatenate two arrays to new array
        
        int[] arr = {1,2,3,4,5};
        int[] arr2= {6,7,8,9,10};
        
        int[] arr3 = new int[arr.length + arr2.length];
        
        for(int i = 0; i < arr.length; i++)
            arr3[i] = arr[i];
        for(int i = 0; i < arr2.length; i++)
            arr3[(arr.length)+i] = arr2[i];
        
        System.out.println(Arrays.toString(arr3));
        //Q4-Equivalence Testing with Arrays
        boolean check = false;
        if(arr.length==arr2.length){
            for (int i = 0; i < arr.length; i++) {
                if(arr[i]==arr2[i])
                    check=true;
                else
                    check=false;                  
            }
            String Answer=(check==true)?"The arrys is  Equivalence":""
                        + "The arr & arr2 is not  Equivalence";
                    System.out.println(Answer); 
        }         
        else
            System.out.println("The arr&arr2 is not  Equivalence"); 

    }
    
}
