package Exercises_Task;
import java.util.Scanner;

public class LargestOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a > b) {
            System.out.println("Largest is: " + a);
        } else if (b > a) {
            System.out.println("Largest is: " + b);
        } else {
            System.out.println("Both numbers are equal.");
        }

        sc.close();
    }
}

