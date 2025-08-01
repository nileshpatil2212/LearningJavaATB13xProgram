package ex_21_OOPs_Polymorphism.MethodOverridinng;

public class Lab184_Method_Overriding {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.sound();
    }
}


class Animal{
    void sound(){
        System.out.println("Default Sound!");
    }
}

class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("Bark!");
    }

    void MethodOverload(){

    }
    void MethodOverload(int a){

    }
}