package Exercises_Task._27th_June._Array_2D;

import java.util.Scanner;

public class DiagonalSum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of square matrix (n x n): ");
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int primarySum = 0;
        int secondarySum = 0;

        // Calculate diagonal sums
        for (int i = 0; i < n; i++) {
            primarySum += matrix[i][i];               // Primary Diagonal
            secondarySum += matrix[i][n - 1 - i];      // Secondary Diagonal
        }

        // Display results
        System.out.println("Primary Diagonal Sum: " + primarySum);
        System.out.println("Secondary Diagonal Sum: " + secondarySum);
    }

}
