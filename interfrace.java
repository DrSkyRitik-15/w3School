
interface  Animal {
    // (does not have a body)
    public void animalSound();
   
    public void sleep() ;
  }
  
  // Subclass (inherit from Animal)
  class Pig implements Animal {
    public void animalSound() {
      // The body of animalSound() is provided here
      System.out.println("The pig says: wee wee");
    }
    public void sleep() {
        System.out.println("Pig is sleeping");
        }
  }
  
  public class interfrace {
    public static void main(String[] args) {
      Pig myPig = new Pig(); // Create a Pig object
      myPig.animalSound();
      myPig.sleep();
    }
  }