<<<<<<< HEAD
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

public class r23 {
    public static void main(String[] args) {

        Student student = new Student("Rakshit", 20);

        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
=======
import java.util.Scanner;

public class r23 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row of  array :");
        int n = sc.nextInt();
        System.out.println("Enter column of  array :");
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("Enter element :");
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Array elements are :");
        for (int i = 0; i < n; i++) {           
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

>>>>>>> 869eb0cd49ea52e5746391757ca755854954bd9e
    }
}
