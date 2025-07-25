package Exercises_Task._25th_June;

import java.util.Scanner;

public class ArmstrongCheck {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = scanner.nextInt();
        int original = number;
        int sum = 0;

        while (number > 0){
            int digit = number % 10;
            sum += digit * digit * digit;
            number = number /10;
        }
            if (sum == original){
                System.out.println("Armstrong Number");
            }
            else {
                System.out.println("Not an Armstrong number.");
            }
    }
}
