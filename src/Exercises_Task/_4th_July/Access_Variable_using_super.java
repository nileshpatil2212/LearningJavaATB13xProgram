package Exercises_Task._4th_July;

public class Access_Variable_using_super {
    public static void main(String[] args) {
        childd c = new childd();
        c.show();
    }
}

class Parents{
    int number = 1000;
}

class childd extends Parents{
    int number = 20;
    void show(){
        System.out.println("Parent Number : " + super.number );
        System.out.println("Child Number : " + number );
    }
}
