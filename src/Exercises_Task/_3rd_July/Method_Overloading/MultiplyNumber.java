package Exercises_Task._3rd_July.Method_Overloading;

public class MultiplyNumber {
    public static void main(String[] args) {
        MathOperations m1 = new MathOperations();
        System.out.println("product of 2 numbers : " + m1.multiply(4,5));
        System.out.println("product of 3 numbers : " + m1.multiply(2,3,4));
    }
}

class MathOperations{
    public int multiply(int a , int b){
        return a*b;
    }
    int multiply(int a , int b , int c){
        return a*b*c;
    }
}
