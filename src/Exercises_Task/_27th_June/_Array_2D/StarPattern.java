package Exercises_Task._27th_June._Array_2D;

public class StarPattern {
    public static void main(String[] args) {
        //    *
        //   ***
        //  *****

        int rows = 3; // Number of rows in the pattern

        for (int i = 1; i <= rows; i++) {
            // Print spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // Print stars (2*i - 1 stars in each row)
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

            // Move to next line
            System.out.println();
        }
    }
}
