package ex_06_Ternary_Operator;

public class Exercise_Odd_Even {
    public static void main(String[] args) {

        // 🔹 Program 2: Check Even or Odd.
        //  Description: Uses ternary to check whether a number is even or odd. A = 19, update the a value and check again A =20;

    //    int A = 19;
        int A = 20;
        String result = (A%2 == 0) ? "Even" : "Odd";
        System.out.println(result);

    }
}
