
class inhertance {
    protected String brand = "Ford";

    public void honk() {
        System.out.println("Donaga!");
    }
}

public class Car extends inhertance {
    private String modelName = "Mustang";

    public static void main(String[] args) {
        Car myFastCar = new Car();
        myFastCar.honk();
        System.out.println(myFastCar.brand + "============== " + myFastCar.modelName);
    }
}
