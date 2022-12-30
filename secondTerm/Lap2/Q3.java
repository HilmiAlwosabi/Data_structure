package secondTerm.Lap2;
    import java.util.ArrayList;
    import java.util.Random;
public class Q3 {

    public ArrayList<String> cars = new ArrayList<String>();
    {cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");}

    public String  removeentry() {

        int size = cars.size();
        Random rn = new Random();
        int a  = rn.nextInt(size) ;


        System.out.println(cars.get(a));
        cars.remove(a);

        a = a-1;
        System.out.println(cars.get(a));
        cars.remove(a);
        
        a = a-1;
        System.out.println(cars.get(a));
        cars.remove(a);

        System.out.println(cars.get(a));
        cars.remove(a);
        return "done";
    }
}
    

