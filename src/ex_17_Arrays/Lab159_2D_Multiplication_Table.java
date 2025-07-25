package ex_17_Arrays;

import java.util.Scanner;

public class Lab159_2D_Multiplication_Table {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size ");
        int size_of_the_table = scanner.nextInt();

        for (int i = 0; i < size_of_the_table; i++) {
            for (int j = 0; j < size_of_the_table; j++) {
                System.out.print(i*j + " | ");
            }
            System.out.println();
        }
    }
}
