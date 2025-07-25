package ex_17_Arrays;

import java.util.Scanner;

public class Lab160_2D_Left_Trinagle {
    public static void main(String[] args) {
        // How the patter we want
        // n = 3
        // ***
        // **
        // *

//        System.out.println("Enter a n e.g n=3");
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
        int n = 3;

        for (int i = n; i >=1 ; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
            
        }

    }
}
