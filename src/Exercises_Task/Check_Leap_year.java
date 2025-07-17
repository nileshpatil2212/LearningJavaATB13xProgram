package Exercises_Task;

import java.util.Scanner;

public class Check_Leap_year {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Year : ");
        int year = scanner.nextInt();

        if (year % 4 == 0){
            if (year % 100 == 0){
                if (year % 400 == 0){
                    System.out.println("Leap Year");
                }else {
                    System.out.println("Not a Leap Year");
                }
            }else {
                System.out.println("Leap Year");
            }
        }else {
            System.out.println("Not a Leap Year");
        }
        scanner.close();
    }
}
