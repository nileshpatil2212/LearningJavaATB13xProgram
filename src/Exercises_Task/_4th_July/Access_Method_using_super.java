package Exercises_Task._4th_July;

public class Access_Method_using_super {
    public static void main(String[] args) {
        Father f1 = new Father();
        f1.display();
    }
}

class Father{
    void display(){
        System.out.println("Father method");
    }
}

class child extends Father{
    void displat(){
        super.display();
        System.out.println("Child Method");
    }
}
