package Exercises_Task;

import java.util.Scanner;

public class number_positive_negative {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number :- ");



        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            if (number > 0) {
                System.out.println(number + " is Positive number");
            } else if (number < 0) {
                System.out.println(number + " is Negative Number");
            } else {
                System.out.println(number + " is zero");
            }
        }else {
            System.out.println("Only Add Numbers");
        }
    }
}
