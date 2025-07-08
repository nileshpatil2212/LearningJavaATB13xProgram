package ex_05_TypeCasting;

public class Lab050_TypeCasting_Narrowing {
    public static void main(String[] args) {
        int val = 300;
    //    byte b= val;  // Narrowing (int --> Byte) - Implicit casting is not allowed.
        byte b1 = (byte)val;  // Narrowing ( int --> Byte) - Explicit casting is not allowed.

        // Data Loss
        System.out.println(b1);
    }
}
