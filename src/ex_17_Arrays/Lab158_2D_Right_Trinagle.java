package ex_17_Arrays;

import java.util.Scanner;

public class Lab158_2D_Right_Trinagle {
    public static void main(String[] args) {

        // How the patter we want
        // n = 3
        // *
        // **
        // ***

        System.out.println("Enter a n e.g n=3");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
            
        }
    }
}
