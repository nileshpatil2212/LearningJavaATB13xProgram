package Exercises_Task._4th_July;

public class Access_constructor_using_super {
    public static void main(String[] args) {
        son s1 = new son();
    }
}

class parent{
    parent(){
        System.out.println("Parents Constructor");
    }
}

class son extends parent{
    son(){
        super();
        System.out.println("son Constructor");
    }
}
