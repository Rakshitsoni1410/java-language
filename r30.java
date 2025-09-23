import java.util.*;

class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class r30 {
    public static void main(String[] args) {

        Student student = new Student("Rakshit", 20);

        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
    }
}