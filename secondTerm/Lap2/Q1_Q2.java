package secondTerm.Lap2;
public class Q1_Q2 {
    public static void main(String[] args) {
        /* 1. Write a Java method that Reverse an array 
            using another array.
        */
        int arr1[]=new int[10];
        int number=0;
        for (int i = 0; i < 10; i++) {
            arr1[i]=++number;
        }
        int arr2[]=new int[10];
        int j=10;
        for (int i = 0; i < 10; i++) {            
                arr2[i]=arr1[--j]; 
        }
        System.out.println("  Q1 \n  arr1 ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("arr["+i+"]= "+arr1[i]);   
        }
        System.out.println("  arr2 ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.println("arr["+i+"]= "+arr2[i]);
        }
        /*2. Write a Java method that Clone an array to a backup array.*/
        int arr3[]=new int[arr2.length];
        for (int i = 0; i < arr3.length; i++) {
             arr3[i]=arr2[i];
        }
        System.out.println(" Q2 \n arr3 ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.println("arr["+i+"]= "+arr3[i]);
        }
    }
}
