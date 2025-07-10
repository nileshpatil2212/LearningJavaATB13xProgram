package ex_08_Increment_Decrement;

public class Exercise_ID_Program_4_5 {
    public static void main(String[] args) {
//      🔹 Program 4:

        int x = 5;
        System.out.println("Value of ++x :" + ++x); // Output: ?  // 6(6)
        System.out.println("Value of x++ : " + x++); // Output: ?  // 6(7)
        System.out.println("Value of x :" + x);   // Output: ? // 7


//    🔹 Program 5:  Interview Question

        int a = 5;
        int b = a++ + ++a;  // 5(6) + 7(7) = b= 5+7 = 12 and a=7
        System.out.println("a: " + a); // Output: ?
        System.out.println("b: " + b); // Output: ?
    }
}
