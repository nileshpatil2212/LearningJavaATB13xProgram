package ex_13_Do_While;

import java.util.Scanner;

public class Test_Check_Vowel_Consonent_From_Word {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);

        System.out.println("Enter a String : ");
        String str = scanner.nextLine().toLowerCase();
         int vowel = 0 ,consonent =0;
         int i = 0;

         while (i < str.length()) {
             char ch = str.charAt(i);
             if (ch >= 'a' && ch <= 'z') {
                 if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                     vowel++;
                 } else {
                     consonent++;
                 }
             }
             i++;
         }
             System.out.println("Vowels: " + vowel);
             System.out.println("Consonants: " + consonent);

             scanner.close();

    }
}
