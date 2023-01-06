package DS_Lap3;

public class Q1 {
    public static void main(String[] args) {
        //Cloning integer Arrays
        int Array[]={1,2,3,4};
        int CopyArray[]=new int[Array.length];
        CopyArray=Array;
        System.out.print("Array index     => ");
        for (int i = 0; i < Array.length; i++)
            System.out.print(Array[i] + " ");
        System.out.print("\nCopyArray index => ");
        for (int i = 0; i < CopyArray.length; i++)
            System.out.print(CopyArray[i] + " ");
    }
    
}