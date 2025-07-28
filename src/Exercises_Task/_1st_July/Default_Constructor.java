package Exercises_Task._1st_July;

public class Default_Constructor {
    public static void main(String[] args) {
        Car c1 = new Car();
    }
}

class Car{
    String name;
    String model;
    int year;

    Car(){
        System.out.println("Default Constructor: Car object created");
    }
}
