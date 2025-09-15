import java.util.Scanner;

public class r21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // ✅ Create Scanner object for input
        
        System.out.println("Enter the number of elements: ");
        int no = sc.nextInt(); // ✅ Read the number of elements
        
        
        int[] array = new int[no];

        
        for (int i = 0; i < no; i++) {
            System.out.println("Enter element " + (i + 1) + ": ");
            
            
            array[i] = sc.nextInt();
        }
        System.out.println("You entered:");
        for (int i = 0; i < no; i++) {
            System.out.println(array[i]);
        }


    }
}
