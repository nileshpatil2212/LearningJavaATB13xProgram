package Exercises_Task._4th_July;

public class TestDefault {
    public static void main(String[] args) {
        student s = new student();
        s.showDetails();
    }
}

class student{
    void showDetails() { // default access
        System.out.println("Default Access of student details");
    }
}


