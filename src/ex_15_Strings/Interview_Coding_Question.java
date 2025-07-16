package ex_15_Strings;

import java.util.Scanner;

public class Interview_Coding_Question {
    public static void main(String[] args) {
        //  Palindrome
        //  madam ->  reverse(madam) -> madam ==
        //  s1 = madam
        // s1_reverse = mada...    }

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a String : ");
//        String s1 = scanner.nextLine();
//
//        String s1_reverse ="";
//        for (int i = s1.length() -1 ;i>=0 ; i--) {
//            s1_reverse += s1.charAt(i);
//        }
//
//        if (s1.equals(s1_reverse)){
//            System.out.println("The string is a palindrome.");
//        }else {
//            System.out.println("The string is NOT a palindrome.");
//        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string :");
        String input = scanner.next();
        String newString_reversed = reverseStringSB(input);

        if (newString_reversed.equalsIgnoreCase(input)){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not Palindrome");
        }

        }


        static String reverseStringSB(String userinput){
        StringBuilder stringBuilder = new StringBuilder(userinput);
        return stringBuilder.reverse().toString();


        }

    }

