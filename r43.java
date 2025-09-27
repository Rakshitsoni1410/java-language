interface A {
    void methodA();
}

interface B {
    void methodB();
}


class C implements A {
    public void methodA() {
        System.out.println("Method A from Interface A");
    }
}

class D extends C implements B {
    public void methodB() {
        System.out.println("Method B from Interface B");
    }
}

public class r43 {
    public static void main(String[] args) {
        D obj = new D();
        obj.methodA(); // inherited from C (implements A)
        obj.methodB(); // from B
    }
}
