package ex_19_OOPs_Constructor;

public class Lab174_Pc_real {
    public static void main(String[] args) {
        Person p1 = new Person("Nilesh" , 987654321 , "Surat");
        Person p2 = new Person("Krish" , 886664658 , "Pune");

//        Person p3 = new Person(); // not a good approach
//        p3.name = "Smita";
//        System.out.println(p3.name);

        System.out.println(p1.name);
        System.out.println(p1.phone);
        System.out.println(p1.address);
    }
}

class Person{
    String name;
    long phone;
    String address;

    Person(){
    }

    Person(String name_user , long phone_user , String address_user){
        this.name = name_user;
        this.phone = phone_user;
        this.address = address_user;
    }

    Person(String name_user , long phone_user){
        this.name = name_user;
        this.phone = phone_user;
    }

    Person(String name_user ){
        this.name = name_user;

    }
}
