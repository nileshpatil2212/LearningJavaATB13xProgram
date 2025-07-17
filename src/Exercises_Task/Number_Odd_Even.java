package Exercises_Task;

import java.util.Scanner;

public class Number_Odd_Even {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number :- ");

        if (scanner.hasNextInt()){
            int number = scanner.nextInt();

            if (number == 0){
                System.out.println("Zero is Even");
            } else if (number%2 ==0) {
                System.out.println("Number is Even");
            }else {
                System.out.println("Number is odd");
            }

        }
        scanner.close();
    }
}
