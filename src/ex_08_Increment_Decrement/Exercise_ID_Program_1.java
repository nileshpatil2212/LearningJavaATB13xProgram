package ex_08_Increment_Decrement;

public class Exercise_ID_Program_1 {
    public static void main(String[] args) {
//    🔹 Program 1:

        int a = 5;
        int b = a++;
        System.out.println("a: " + a + ", b: " + b);


        int x = 5;
        int y = x++ + ++x;  // 5(6) + 7(7) // x = 7 , y = 5+7 = 12
        System.out.println("x : " + x +", y :" +y);
    }


}
