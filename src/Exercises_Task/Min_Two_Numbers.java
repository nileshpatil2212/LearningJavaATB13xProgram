package Exercises_Task;

import java.util.Scanner;

public class Min_Two_Numbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number 1 : ");
        int a = scanner.nextInt();
        System.out.println("Enter number 2 : ");
        int b = scanner.nextInt();

        if (a < b) {
            System.out.println("minimum is :- " + a);
        } else if (b < a) {
            System.out.println("minimum is :- " + b);
        } else {
            System.out.println("Both are same");
        }

        scanner.close();

    }
}
