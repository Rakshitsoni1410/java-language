public class r24 {
    public static void main(String[] args) {
        int[][] matrix = new int[2][];
        matrix[0] = new int[3];// row
        matrix[1] = new int[1];// colum
        int value = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++)
                matrix[i][j] = value++;
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++)
                System.out.print(matrix[i][j] + " ");
            System.out.println();
        }
    }
}
