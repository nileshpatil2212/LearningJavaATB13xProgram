package ex_12_While;

import java.util.Scanner;

public class Lab114_While_IQ_Factorial {
    public static void main(String[] args) {
        // Factorial Program

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Factorial Program\nEnter the Number ! :" );
        if (!scanner.hasNextInt()){
            System.out.println("Enter the Integer value Only ");
            return;
        }
        int number = scanner.nextInt();

        int factorial = 1;

        if (number > 0){
            System.out.println("Negative Factorial is not allowed. ");
        }
        if (number <=0){
            System.out.println(factorial);
        }
        else {
            // Calculate the Factorial
            for (int i = 1; i <= number ; i++) {
                factorial = factorial * i;
                
            }

        }
        System.out.println("Factorial is -> " + factorial);
    }
}
