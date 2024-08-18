//filename: Main.java
public class methodWithCons {
    int modelYear;
    String modelName;
  
    public  methodWithCons(int year, String name) {
      modelYear = year;
      modelName = name;
      System.out.println("Year name = "+modelYear + "\n " +"Model name"+ modelName);
    }
  
    public static void main(String[] args) {
       methodWithCons myCar = new  methodWithCons(1969, "Mustang");
     // System.out.println(myCar.modelYear + " " + myCar.modelName);
    }
  }
  