package Exercises_Task;

import java.util.Scanner;

public class LoanEligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your age :");
        int age = scanner.nextInt();
        System.out.println("Enter your salary :");
        double salary = scanner.nextDouble();
        System.out.println("Enter Credit Score :");
        int creditscore = scanner.nextInt();

        if (age <= 0){
            System.out.println("Invalid Age , Age must be a positive number");
        } else if (age < 18) {
            System.out.println("Not eligible : Minimum age required 18.");
        } else if (age > 80) {
            System.out.println("Not eligible: Age cannot exceed 80.");
        } else if (salary <=0) {
            System.out.println("Invalid Salary , Salary must be a positive number.");
        } else if (salary < 30000) {
            System.out.println("Not eligible: Minimum salary required is ₹30,000.");
        } else if (creditscore <=0 ) {
            System.out.println("Invalid Credit Score , Must be a Positive Number");
        } else if (creditscore < 650) {
            System.out.println("NOt eligible , minimum Credit score atleast 650");
        }else if (creditscore > 850) {
            System.out.println("Not eligible , Maximum Credit score Allow 850");
        }else {
            System.out.println("Congratulations !!!!!! You are eligible For Loan");
            System.out.println("Details: Age = " + age + ", Salary = ₹" + salary + ", Credit Score = " + creditscore);

        }
    }
}
