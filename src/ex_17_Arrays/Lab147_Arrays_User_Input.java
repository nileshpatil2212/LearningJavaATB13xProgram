package ex_17_Arrays;

import java.util.Scanner;

public class Lab147_Arrays_User_Input {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array(int) only :");
        int size = sc.nextInt();

        int[] numbers_marks = new int[size];

//        float[] numbers_marks2 = new float[size];
//        String[] numbers_marks2 = new String[size];
        for (int i = 0; i < numbers_marks.length; i++) {
            System.out.println("Enter the numbers :");
            numbers_marks[i] = sc.nextInt();
        }

        System.out.println(" --- Below Code is Printing --- ");
        for (int i = 0; i < numbers_marks.length; i++) {
            System.out.println(numbers_marks[i]);
            
        }
    }
}
