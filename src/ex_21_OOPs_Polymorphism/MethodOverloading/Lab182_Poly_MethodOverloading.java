package ex_21_OOPs_Polymorphism.MethodOverloading;

public class Lab182_Poly_MethodOverloading {
    public static void main(String[] args) {
        MathOperations m1 = new MathOperations();
        int r1 = m1.add(3,4);
        int r2 = m1.add(3,4,5);
        double r3 = m1.add(3.14 , 5.16);
        String r4 = m1.add("pramod" , "dutta");
    }
}

class MathOperations{
    int add(int a , int b){
        return  a+b;
    }

    int add(int a , int b , int c){
        return  a+b+c;
    }

    double add(double a , double b){
        return  a+b;
    }

    String add(String a , String b){
        return  a+b;
    }
}


