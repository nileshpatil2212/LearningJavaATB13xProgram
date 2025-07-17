package Exercises_Task;

import java.util.Scanner;

public class Max_Three_Numbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number 1");
        int a = scanner.nextInt();
        System.out.println("Enter number 2");
        int b = scanner.nextInt();
        System.out.println("Enter number 3");
        int c = scanner.nextInt();

        if (a > b && a >c){
            System.out.println(a + " is maximum");
        } else if (b > a && b > c) {
            System.out.println(b + " is maximum");
        } else if (c > a && c > b) {
            System.out.println(c + " is maximum");

        }else {
            System.out.println("All Are same");
        }
    }
}
