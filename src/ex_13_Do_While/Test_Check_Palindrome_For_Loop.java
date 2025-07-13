package ex_13_Do_While;

import java.util.Scanner;

public class Test_Check_Palindrome_For_Loop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string : ");

        String str = scanner.next();
        String rev = "";  // to store reverse string

       // int i = str.length() -1 ;   // If we use a while loop, then Add this statement before.


        for(int i = str.length()-1; i >=0; i--){
            rev = rev + str.charAt(i);
        }
        System.out.println("Reverse String : " + rev);

        if (str.equals(rev)){
            System.out.println(str + " is a palindrome.");
        }else {
            System.out.println(str + " is not a palindrome.");
        }
    }
}
