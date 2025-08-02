package Exercises_Task._3rd_July.Method_Overloading;

public class FindMaximum {
    public static void main(String[] args) {
        Utility u1 = new Utility();
        System.out.println("max in 10 & 20 : " + u1.max(10,20));
        System.out.println("Max in 5 , 10 & 15 " + u1.max(5,10,15));
        System.out.println("max in 2.5 & 6.5 " + u1.max(2.5 , 6.5));

    }
}

class Utility{
    public int max(int a , int b){
        return (a >b) ? a:b;
    }

    public int max(int a , int b , int c){
        return Math.max(a,Math.max(b,c));
    }

    public double max(double a , double b){
        return (a > b) ? a:b;
    }
}
