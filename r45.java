interface A {
    default void show() {
        System.out.println("A's show");
    }
}

interface B {
    default void show() {
        System.out.println("B's show");
    }
}

// Class trying to inherit both
public class r45 implements A, B {
    // Compilation Error unless we override show()
    
    public void show() {
        // Resolving ambiguity
        A.super.show(); // or B.super.show()
        System.out.println("r45's own show");
    }

    public static void main(String[] args) {
        r45 obj = new r45();
        obj.show();
    }
}
