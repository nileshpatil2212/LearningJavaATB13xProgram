package ex_05_TypeCasting;

public class Exercise_TypeCasting_Division {
    public static void main(String[] args) {
//        🔹 Program 7: Typecasting in Division
//        Description: int a = 10, int b = 3; now divide 10/3 and store the decimal value in the Result variable and print it.

        int a = 10 ;
        int b = 3;
        double result = (double) a/b;

        System.out.println("Value of a : " + a);
        System.out.println("Value of b : " + b);
        System.out.println("Result of Division :" + result);
    }
}
