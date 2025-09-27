final class Vehicle {
  
}

public class r41 {
    public static void main(String[] args) {
        final int speed = 100;
        display(speed);
    }

    // Correctly defined method outside of main
    public static final void display(int speed) {
        System.out.println("speed: " + speed);
    }
}
