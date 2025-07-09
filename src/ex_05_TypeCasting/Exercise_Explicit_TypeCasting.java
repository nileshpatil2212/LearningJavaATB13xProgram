package ex_05_TypeCasting;

public class Exercise_Explicit_TypeCasting {
    public static void main(String[] args) {
//        🔹 Program 5: Explicit Typecasting (Narrowing)
//           Description: Casts a double to an int, cutting off decimals value.

        double A = 18.45;
//        double a = A;
        int B = (int)A;

        System.out.println("Value of A(Double) : " + A);
        System.out.println("Value of B(int) : " + B);


    }
}
