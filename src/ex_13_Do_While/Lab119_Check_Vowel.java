package ex_13_Do_While;

import java.util.Scanner;

public class Lab119_Check_Vowel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Single character : ");
        char ch = scanner.next().toLowerCase().charAt(0);

        if (ch == 'a' || ch == 'e' ||ch == 'i' ||ch == 'o' ||ch == 'u' ){
            System.out.println(ch + " is s Vowel !");
        } else if (ch >= 'a' && ch<='z') {
            System.out.println(ch + " is consonent");
            
        } else {
            System.out.println("Invalid Character !!!!");
        }


    }
}
