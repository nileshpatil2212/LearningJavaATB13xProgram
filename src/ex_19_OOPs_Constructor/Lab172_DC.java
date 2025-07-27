package ex_19_OOPs_Constructor;

public class Lab172_DC {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car();
        c1.name = "Tesla";  // if we give value seprately then it will consider this else default created Unknown
        System.out.println(c1.name);
        System.out.println(c1.year);
        System.out.println(c1.model);

        System.out.println(c2.name);
        c2.name = "Audi";
        System.out.println("New Value After Add : " + c2.name);

        baby1 b1 = new baby1();
        b1.name = "Nivishaaa";
        System.out.println(b1.name);
    }
}

class Car{
    String name;
    int year;
    String model;


    Car(){

        name = "Unknown Car";
        year = 1991;
        model = "XXX";
    }
}

class baby1{
    String name;

    baby1(){
        name = "Gugu";
    }
}
