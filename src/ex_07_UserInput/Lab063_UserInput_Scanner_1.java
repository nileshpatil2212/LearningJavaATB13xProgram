package ex_07_UserInput;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Lab063_UserInput_Scanner_1 {
    public static void main(String[] args) {
        System.out.println("Enter the String :");
        Scanner scanner  = new Scanner(System.in);
        String s = scanner.next();
        System.out.println("This is a String Input : " + s);

        System.out.println("Enter the int : ");
        int int_input = scanner.nextInt();
        System.out.println("This is you int input :"  + int_input);

        System.out.println("Entr the Double : ");
        double double_input = scanner.nextDouble();
        System.out.println("This is you Double input :"  + double_input);


    }
}
