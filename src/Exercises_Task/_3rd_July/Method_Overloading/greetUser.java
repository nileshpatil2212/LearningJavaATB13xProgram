package Exercises_Task._3rd_July.Method_Overloading;

public class greetUser {
    public static void main(String[] args) {
        Greeter g1 = new Greeter();
        g1.greet();
        g1.greet("Nilesh");
    }
}

class Greeter{
    void greet(){
        System.out.println("Hello");
    }
    void greet(String name){
        System.out.println("Hello " + name);
    }
}
