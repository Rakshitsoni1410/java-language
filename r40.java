interface Greeting {
    void sayhello();
}

public class r40 {

    public static void main(String[] args) {
        Greeting g = new Greeting() {
            public void sayhello() {
                System.out.println(
                        "hello from inner class");
            }
        };
        g.sayhello();
    }
}