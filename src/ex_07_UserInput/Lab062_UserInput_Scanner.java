package ex_07_UserInput;

import java.util.Scanner;

public class Lab062_UserInput_Scanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Age : ");

        int age = scanner.nextInt();
        String CanIVote = age >= 18 ? "Yes :)" : "No :(";
        System.out.println(CanIVote);
    }
}
