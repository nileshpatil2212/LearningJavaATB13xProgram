package Exercises_Task;

import java.util.Scanner;

public class Check_vowels_consonant {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a single character : ");
        char ch = scanner.next().toLowerCase().charAt(0);


        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            System.out.println(ch + " is Vowel");
        }else {
            System.out.println(ch + " is consonant");
        }

        scanner.close();
    }
}
