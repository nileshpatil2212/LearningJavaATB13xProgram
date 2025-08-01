package ex_21_OOPs_Polymorphism.MethodOverloading;

public class Calculator {
    public static void main(String[] args) {
        calc c1 = new calc();
        c1.add(3,4);
        c1.add(3.14,6.16);
    }
}

class calc {

    int add(int a , int b){
        return  a+b;
    }

    double add(double a , double b){
        return a+b;
    }

}
