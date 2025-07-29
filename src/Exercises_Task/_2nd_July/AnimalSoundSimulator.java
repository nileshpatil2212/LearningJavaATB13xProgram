package Exercises_Task._2nd_July;

public class AnimalSoundSimulator {
    public static void main(String[] args) {
        cat c1 = new cat();
        c1.makeSound();
        c1.meow();
    }
}

class Animal{
    void makeSound(){
        System.out.println("Animal make a sound");
    }
}


class cat extends Animal{
    void meow(){
        System.out.println("Cat voice : Meow");
    }
}
