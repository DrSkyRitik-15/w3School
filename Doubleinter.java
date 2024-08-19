interface Song{

    void Song();
}

interface Sound{

    void Sound();
}

class Dog implements Song, Sound{

    public void Song() {
        System.out.println("Woof");
    }

    public void Sound() {
        System.out.println("looooooooooooooooool");
    }
}

public class Doubleinter {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.Song();
        dog.Sound();
    }
}
