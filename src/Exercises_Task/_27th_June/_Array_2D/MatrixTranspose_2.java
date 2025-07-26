package Exercises_Task._27th_June._Array_2D;

public class MatrixTranspose_2 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6}
        };

        // Transpose matrix
        int[][] transpose = new int[3][2]; // rows become columns

        for (int i = 0; i < 2; i++) {         // 2 rows
            for (int j = 0; j < 3; j++) {     // 3 columns
                transpose[j][i] = matrix[i][j];
            }
        }

        // Print original matrix
        System.out.println("Original Matrix:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Print transposed matrix
        System.out.println("Transposed Matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}
