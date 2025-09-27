interface  s{
    void show();

}
class Dog implements s{
    public void show()
    {
        System.out.println("bark ");
    }
}

public class r39 {
    public static void main(String[] args) {
        s a =new Dog();
        a.show();

    }
}
