package Exercises_Task;

import java.util.Scanner;

public class ATMWithdrawal {
    public static void main(String[] args) {
        int balance = 10000;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter amount to withdraw :");
        int amount  =scanner.nextInt();

        if (amount <= 0){
            System.out.println("Invalid amount , must be greater than 0");
        } else if (amount % 100 != 0) {
            System.out.println("Amount must be a multiple of 100.");
        } else if (amount > balance) {
            System.out.println("Insufficient Balance.");
        }else {
            balance -= amount;
            System.out.println("Withdraw Successful");
            System.out.println("Available Balance : " + balance);
        }
        scanner.close();
    }
}
