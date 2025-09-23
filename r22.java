import java.util.Scanner;

public class r22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter element :");
            arr[i] = sc.nextInt();
        }
        System.out.println("Array elements are :");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        // sum of array
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        System.out.println("\nSum of array is :" + sum);
        }
    }
}
