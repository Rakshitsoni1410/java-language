import java.util.Scanner;

public class r25 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("enter the row for the array ");
        int row = a.nextInt();
        int[][] matrix = new int[row][];
        for (int i = 0; i < row; i++) {
    System.out.print("Enter number of columns in row " + i + ": ");
    int cols = a.nextInt();
    matrix[i] = new int[cols];

    for (int j = 0; j < cols; j++) {        System.out.print("Enter value for [" + i + "][" + j + "]: ");
        matrix[i][j] = a.nextInt();
    }
}


        int value = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = value++;
            }
        }
        System.out.println("\nMatrix");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }

}
