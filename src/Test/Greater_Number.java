package Test;

import java.util.Scanner;

public class Greater_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number 1 :");
        int num1 = scanner.nextInt();

        System.out.println("Enter Number 2 :");
        int num2 = scanner.nextInt();

        if(num1>num2){
            System.out.println(num1 + " is a greater number");
        } else if (num2>num1) {
            System.out.println(num2 + " is a greater number");
        }
        else {
            System.out.println("Both are Equal");
        }

    }
}
