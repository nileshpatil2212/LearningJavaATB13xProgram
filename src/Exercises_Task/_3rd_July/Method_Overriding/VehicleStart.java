package Exercises_Task._3rd_July.Method_Overriding;

public class VehicleStart {
    public static void main(String[] args) {
        Vehicle Bike = new Bike();
        Vehicle Car = new Car();

        Bike.start();
        Car.start();

    }
}

class Vehicle{
    public void start(){
        System.out.println("Starting Vehicle..");
    }
}

class Bike extends Vehicle{
    @Override
    public void start(){
        System.out.println("Kick start the bike");
    }
}


class Car extends Vehicle{
    @Override
    public void start(){
        System.out.println("Turn the key to start the car");
    }
}

