class Animal {
    void sound() {
        System.out.println("animal make sound ");
    }
}

class Dog extends Animal {
    void sound() {
        super.sound();
        System.out.println("dog bark");
    }
}

public class r38 {
    public static void main(String[] args) {
        Dog a = new Dog();
        a.sound();
    }
}
