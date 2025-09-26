abstract class vehicle {
    abstract void start();

    void show() {
        System.out.println("vehicle need");
    }
}

class car extends vehicle {
    void start() {
        System.out.println("Car is starting...");
    }

    void show() {
        System.out.println("In car, 5 to 7 people can sit");
    }
}

public class r37 {
    public static void main(String[] args) {
        vehicle c = new car();
        c.start();  
        c.show();   
    }
}
