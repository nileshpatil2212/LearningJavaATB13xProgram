package Exercises_Task._27th_June;

import java.util.Scanner;

public class DivisibilityCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = scanner.nextInt();

        if (num % 5 == 0 && num % 11 == 0){
            System.out.println("the number is divisible by both 5 and 11 ");
        }else {
            System.out.println("the number is NOT divisible by both 5 and 11 ");
        }

    }



}
