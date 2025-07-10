package ex_09_If_Condition;

import java.util.Scanner;

public class Lab076_If_else {
    public static void main(String[] args) {




//        int age = Integer.parseInt(args[0]);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Age : ");
        int age = scanner.nextInt();

        if (age <=18) {
            System.out.println("Not Allowed to  vote");
        }
        else {
            System.out.println("Allowed to Vote");
        }

    }
}
