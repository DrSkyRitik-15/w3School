import java.util.ArrayList;

public class ArrayLis { 
  public static void main(String[] args) { 
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    for (int i = 0; i < cars.size(); i++) {
      System.out.println(cars.get(i));
    }
    for(String ok:cars)
    {
    System.out.println(ok);
    }
    } 
}