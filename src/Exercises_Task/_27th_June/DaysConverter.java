package Exercises_Task._27th_June;

import java.util.Scanner;

public class DaysConverter {
    public static void main(String[] args) {
        ///        :- Take the Days Input from the User
        ///        Define the conversion logic:
        ///         :- Assume 1 year = 365 days.
        ///         :- Assume 1 month = 30 days
        ///         :- Convert the Days into Years, Month and days and Print it.
        /// if you input 1000 days, the output of the program would be:  2 years, 9 months, and 0 days.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter s number of days : ");
        int totaldays = scanner.nextInt();

        if (totaldays < 0){
            System.out.println("Invalid Days , Add Only Positive Days Number only");
        }else {
            int years = totaldays /365;
            int remainingdays = totaldays % 365;
            int months = remainingdays /30;
            int days = remainingdays % 30;

            System.out.println("Result: " + years + " years, " + months + " months, and " + days + " days.");

        }

        }
}
