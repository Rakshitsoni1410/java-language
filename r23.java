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

    }
}
