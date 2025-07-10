package ex_08_Increment_Decrement;

public class Exercise_ID_Program_6 {
    public static void main(String[] args) {
//        🔹Program 6:  Interview Question

        int x = 5;
        int y = x++ + ++x + x++ + ++x;   // 5(6) + 7(7) + 7(8) + 9(9) = 5+7+7+9 = 28  // x= 9 , y = 28
        System.out.println("x = " + x + ", y = " + y);

//      Pramod Sir Question
        int a = 5;
        int b = a++ + ++a + a++ + ++a; // 5(6) + 7(7) + 7(8) + 9(9) = 5+7+7+9 = 28 // a = 9 , y = 28
        System.out.println("a = " + a + ", b = " + b);


//                | Expression | Value used | x after |
//                | ---------- | ---------- | ------- |
//                | x++        | 5          | 6       |
//                | ++x        | 7          | 7       |
//                | x++        | 7          | 8       |
//                | ++x        | 9          | 9       |

    }
}
