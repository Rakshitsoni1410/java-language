// in heritance   single
class Car {
    void show() {
        System.out.println("car is best for racing ");
    }
}

class Nano extends Car {
    void show() {
        System.out.println(" not best when its nano ");
    }
}

public class r33 {
    public static void main(String[] args) {
        Nano r = new Nano();
        r.show();
    }
}
