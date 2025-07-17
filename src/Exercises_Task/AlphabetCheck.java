package Exercises_Task;

import java.util.Scanner;

public class AlphabetCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Character :");
        char ch = scanner.next().toLowerCase().charAt(0);

        if (ch >= 'a' && ch <= 'z'){
            System.out.println("It is an Alphabet");
        }else {
            System.out.println("Not an Alphabet");
        }
        scanner.close();
    }
}
