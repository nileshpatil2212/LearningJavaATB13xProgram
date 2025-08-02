package Exercises_Task._3rd_July.Method_Overloading;

public class AddTwoNumber {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        int sumInt = c1.add(10,20);
        System.out.println("Sum of integers : " + sumInt);

        double sumDouble = c1.add(1.2 , 4.8);
        System.out.println("Sum of doubles : " + sumDouble);
    }


}

class Calculator{
     public int add(int a , int b){
        return a + b;
    }
    public double add(double a , double b){
        return  a + b;
    }
}
