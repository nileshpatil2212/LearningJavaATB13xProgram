package ex_14_Functions;

import java.util.Scanner;

public class Lab127_Function_Arth {
    public static void main(String[] args) {

        // Create a Function of Sub, Sum, Mul and Div
        // with parameter, a, b (take the parameter from the User)

        // Logic Building
        // Step 1 -> Inputs and Outputs
        //  a, b - int -> Scanner
        //  int -> variable result ->


        // Step 2 - Rough logic -> Create functions
        // function -> type 4th - with return and with arguments/ parameters


        // Step 3 - Write the code and Find and Fix  -> Edge Cases

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Num 1 : ");
        int a = 0;
        if (scanner.hasNextInt()){
            a = scanner.nextInt();
        }else {
            System.out.println("Enter the integer only. ");
           // return;
            System.exit(0);

        }


        System.out.println("Enter the Num 2 : ");
        int b = 0;
        if (scanner.hasNextInt()){
            b = scanner.nextInt();
        }else {
            System.out.println("Enter the integer only. ");
            return;

        }


        int result_sum = sum(a,b);
        System.out.println("Your Answer is : " + result_sum);

        int result_sub =sub(a,b);
        int result_div = div(a,b);
        int result_mul = mul(a,b);
        int result_mod = mod(a,b);

        System.out.println("Substraction : " +result_sub);
        System.out.println("Division : " + result_div);
        System.out.println("Multiplication : " + result_mul);
        System.out.println("Mod : " + result_mod);



    }

    /**
     * Adds two integers.
     *
     * @param a the first integer
     * @param b the second integer
     * @return the sum of a and b
     */

        static int sum(int a ,int b){
        return a+b;

        }

    /**
     * Subtracts the second integer from the first.
     *
     * @param a the first integer
     * @param b the second integer
     * @return the difference of a and b
     */

    static int sub(int a , int b){
        return a-b;
    }
    /**
     * Divides the first integer by the second.
     *
     * @param a the dividend
     * @param b the divisor
     * @return the quotient of a and b
     */

    static int div(int a, int b){
        if (b ==0){
         //   throw new ArithmeticException("B Can't be zero");
            System.out.println("B can't be zero");
            System.exit(0);
        }
        return a/b;
    }

    static int mul(int a , int b){
        return a*b;
    }

    // mod
    static int mod(int a, int b){
        return a%b;
    }

}
