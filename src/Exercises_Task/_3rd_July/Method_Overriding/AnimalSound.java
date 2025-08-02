package Exercises_Task._3rd_July.Method_Overriding;

public class AnimalSound {
    public static void main(String[] args) {
        Animal Dog = new Dog();
        Animal Cat = new Cat();
        Animal Cow = new Cow();

        System.out.println("Dog Sound : " + Dog.sound());
        System.out.println("Cat Sound : " + Cat.sound());
        System.out.println("Cow Sound : " + Cow.sound());
    }

}

class Animal{
    public String sound(){
        return "sound";
    }
}


class Dog extends Animal{
    @Override
    public String sound(){
        return "bark";
    }
}

class Cat extends Animal{
    @Override
    public String sound(){
        return "Meow";
    }
}

class Cow extends Animal{
    @Override
    public String sound(){
        return "Moo";
    }
}
