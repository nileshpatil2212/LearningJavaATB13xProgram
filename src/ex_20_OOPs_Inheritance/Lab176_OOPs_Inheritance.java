package ex_20_OOPs_Inheritance;

public class Lab176_OOPs_Inheritance {
    public static void main(String[] args) {
        Father f1 = new Father();
        System.out.println(f1.gold_f);
        f1.bhk2();

        Son s1 = new Son();
        System.out.println(s1.gold_f);
        s1.bhk3();
    }
}

class Father{
    int gold_f = 1000;

    void bhk2(){
        System.out.println("Father - 2BHK");
    }
}

class Son extends Father{
    // the moment we add extends Father means From tha Father class , all the things can Son access

    void bhk3(){
        System.out.println("Son - 3BHK");
    }
}
