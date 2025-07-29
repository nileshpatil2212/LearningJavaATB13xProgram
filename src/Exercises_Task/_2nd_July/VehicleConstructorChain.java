package Exercises_Task._2nd_July;

public class VehicleConstructorChain {
    public static void main(String[] args) {
        Bike b1 = new Bike();

    }
}

class Vehicle{
    Vehicle(){
        System.out.println("Vehicle is ready");
    }
}

class Bike extends Vehicle{
    Bike(){
        System.out.println("Bike is ready");
    }

}