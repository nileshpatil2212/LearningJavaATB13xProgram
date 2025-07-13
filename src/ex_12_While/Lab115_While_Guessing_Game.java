package ex_12_While;

import java.util.Random;
import java.util.Scanner;

public class Lab115_While_Guessing_Game {
    public static void main(String[] args) {
        Random random = new Random();
        int numberToGuess = random.nextInt(100)+1; // 0 to 100
       // System.out.println(numberToGuess);


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number : ");

        int guess;
        int attemps = 0;

        while (true){
            guess = scanner.nextInt();
            attemps++;

            if (guess <numberToGuess){
                System.out.println("too Low , Try Again");
            }
            else if (guess > numberToGuess){
                System.out.println("Too high , Try Again ");
            }
            else {
                System.out.println("Correct ! You Guessed it in " + attemps + " Attemps");
                break;
            }

        }

    }
}
