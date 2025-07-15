package ex_11_Loop;

import java.util.Scanner;

public class Task_Check_LeapYear {
    public static void main(String[] args) {
        // ✅ Leap Year Checker
        //Create a program that determines whether a given year is a leap year.
        // A leap year is divisible by 4, but not by 100 unless it is also divisible by 400.
        // Use an if-else statement to make this determination.
        Scanner scanner = new Scanner(System.in);

        char choice;
        do {
            System.out.println("Enter a Year : ");
            int year = scanner.nextInt();

            if (year % 4 == 0){
                if (year % 100 == 0){
                    if (year % 400 == 0){
                        System.out.println(year + " is a leap year.");
                    }else {
                        System.out.println(year + " is not a leap year.");
                    }
                }else {
                    System.out.println(year + " is a leap year.");
                }
            }else {
                System.out.println(year + " is not a leap year.");
            }

            System.out.print("Do you want to check another year? (y/n): ");
            choice = scanner.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

            scanner.close();
    }
}
