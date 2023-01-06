package DS_Lap3;

public class Q2 {
    //Cloning Objects Arrays
    String name;
    int phone;
    
    public Q2(String a, int b) {
        this.name = a;
        this.phone = b;
    }
    
    @Override
    public String toString(){
        return "{ name : " + name
                + ", phone : " + phone +"}";
    }
    public static void main(String[] args) {
        
        Q2[] arr = new Q2[2];
        arr[0] = new Q2("ali", 7700000);
        arr[1] = new Q2("khaled", 711111);
        
        Q2[] arr2 = new Q2[arr.length];
        arr2 = arr;
        
        for(int i=0; i<arr2.length; i++){
            System.out.println(arr2[i].toString());
        }
    }
}
