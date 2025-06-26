package Test;

import java.util.Scanner;

public class StringManipulationBasic {
    public static void main(String[] args) {

        // User Input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string :");
        String input  = scanner.nextLine();

        //Perform
        int length = input.length();
        char firstChar = input.charAt(0);
        String Substring = input.substring(6);

        // output
        System.out.println("Length : " + length);
        System.out.println("First Character : " + firstChar);
        System.out.println("Substring : " + Substring);

    }
}
