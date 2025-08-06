package ex_23_OOPs_Super;

public class Lab188_Super {
    public static void main(String[] args) {
        Animal cat = new Animal();
        cat.sound();
    }
}

class God{
    public int gold = 100;
    void sound(){
        System.out.println("God !!");
    }

    God(){
        System.out.println("GOD DC");
    }
}

class Animal extends God{
    @Override
    void sound(){
        super.sound();
    }

    Animal(){
        super();
    }
    Animal(int a , int b){
        System.out.println(a+b);
    }
    void test(){
        System.out.println(super.gold);
    }
}
