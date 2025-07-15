package ex_11_Loop;

import java.util.Scanner;

public class Task_Grade_Calculation {
    public static void main(String[] args) {
//        ✅ Grade Calculator:
//          Write a program that calculates and displays the letter grade for a given numerical score (e.g., A, B, C, D, or F)
//          based on the following grading scale:
//          A: 90-100
//          B: 80-89
//          C: 70-79
//          D: 60-69
//          F: 0-59

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a score(0-100) : ");
        int score = scanner.nextInt();
        char grade;

        if (score >=90 && score <=100){
            grade = 'A';
        } else if (score >=80 && score <=89) {
            grade = 'B';
        } else if (score >=70 && score <=79) {
            grade = 'C';
        } else if (score >=60 && score <=69) {
            grade = 'D';
        } else if (score >=0 && score <=59) {
            grade = 'F';
        }else {
            System.out.println("Invalid Score , Please enter a value between 0 to 100. ");
            scanner.close();
            return;
        }

        System.out.println("Score : " + score);
        System.out.println("Grade : " + grade);

    }
}
