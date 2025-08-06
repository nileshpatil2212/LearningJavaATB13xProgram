package Exercises_Task._4th_July;

public class Demonstrate_Protected {
    public static void main(String[] args) {
        dog d = new dog();
        d.doEat();
    }
}

class Animal{
    protected void eat(){
        System.out.println("Animal is eating");
    }
}

class dog extends Animal{
    void doEat(){
        eat();
    }
}
