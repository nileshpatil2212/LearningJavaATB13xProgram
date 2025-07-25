package Exercises_Task._25th_June;

import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number :");
        int number = scanner.nextInt();

        int original = number;
        int reverse = 0;

        while (number > 0){
            int digit = number % 10;
            reverse = (reverse *10 ) + digit;
            number /=10;
        }

        if (original == reverse){
            System.out.println("The number is a Palindrome");
        } else {
            System.out.println("The number is NOT a Palindrome");

        }
    }
}
