package Exercises_Task._27th_June._Array_2D;

import java.util.Scanner;

public class MatrixTranspose_UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter no. of rows : ");
        int rows = scanner.nextInt();
        System.out.println("Enter no. of Columns : ");
        int columns = scanner.nextInt();

        int[][] matrix = new int[rows][columns];

        System.out.println("Enter the matrix element :");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.println("Elements [" + i + "][" + j + "] : " );
                matrix[i][j] = scanner.nextInt();
            }
        }

        int[][] transpose = new int[columns][rows];
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                transpose[i][j] = matrix[j][i];
            }
        }

        System.out.println("\nOriginal Matrix:");
        printMatrix(matrix);

        // Print transpose
        System.out.println("\nTransposed Matrix:");
        printMatrix(transpose);
    }


    public static void printMatrix(int[][] mat) {
        for (int[] row : mat) {
            for (int val : row) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }
    }
}
