package ex_06_Ternary_Operator;

import java.util.Scanner;

public class Exercise_Grade_Calculation {
    public static void main(String[] args) {

        // 🔹Program 3: Grade Calculation Using Nested Ternary
        //  Description: Marks 90 = A+, 75 = A, 60 = B, 40 = C, below 40 Fail.
        // Rough Logic                        // Code Logic
        // Marks = 90+ --> A+                         marks >=90
        // Marks = 75 to 89 --> A               75 <= marks < 90
        // Marks = 60 to 74 --> B               60 <= marks < 75
        // Marks = 40 to 59 --> C               40 <= marks < 60
        // Marks < 40 --> Fail                        marks < 40

     //   int marks = 65;
        //   float marks = 65.5f;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks : ");
    //    int marks = sc.nextInt();
        double marks = sc.nextDouble();
        String grade = (marks >= 90) ? "A+" :
                        (marks >=75 && marks < 90 ) ? "A":
                                (marks >=60 && marks <75 ) ? "B" :
                                        (marks >=40 && marks <60 ) ? "C" : "Fail";
        // A-->
        System.out.println(grade);
    }
}
