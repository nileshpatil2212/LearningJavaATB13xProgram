package ex_23_OOPs_Super;

public class Lab187_SuperKeyword {
    public static void main(String[] args) {
        car c1 = new car(100);
        c1.display();
    }
}

class Vehicle{
    public int maxSpeed = 180;

    Vehicle(){
        System.out.println("default Constructor");
    }

    Vehicle(int a){
        System.out.println("Parameterized Constructor");
        System.out.println("Parameterized Constructor" + a);
    }

    void message(int a){
        System.out.println("Type 2");
    }
    void message(){
        System.out.println("Type 1");
    }
    int message(String a){
        System.out.println("Type 4");
        return 0;
    }

    void display(){
        System.out.println("Vehicle Parent");
    }
}

class car extends Vehicle{
    private int maxSpeed = 281;

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    car(){
        super();
    }
    car(int a){
        super(10);
    }

    @Override
    void display() {
        System.out.println(super.maxSpeed); // instance variable call
        System.out.println(this.maxSpeed); // this means my variable call
        System.out.println("Hii Override");
    }
}
