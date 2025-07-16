package ex_16_StringBuffer_Builder_StringFunctions;

import java.util.Scanner;

public class Interview_Vowel {
    public static void main(String[] args) {
        // Create a java program to count the words and consonants.
        // pramod - > V -> 2 | C -> 4

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Input");
        String input = scanner.next();
//        String input = "Java Program to Count Vowels and Consonants";
//        char cc =  input.charAt(0);
        int vowels = 0;
        int consonants = 0;

        input =input.toLowerCase();
        System.out.println(input);

        for (int i = 0; i < input.length(); i++){
            char ch = input.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                vowels++;
            }
            else {
                consonants++;
            }

            System.out.println("Numbers of Vowels : " + vowels);
            System.out.println("Numbers of Consonants : " + consonants);
        }
    }
}
