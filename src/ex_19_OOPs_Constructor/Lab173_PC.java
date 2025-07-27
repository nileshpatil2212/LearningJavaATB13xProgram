package ex_19_OOPs_Constructor;

public class Lab173_PC {
    public static void main(String[] args) {
        BabyA b1 = new BabyA();
        BabyA b2 = new BabyA();
        System.out.println(b1.name);
        System.out.println(b2.name);

        BabyA b3 = new BabyA("Lucky" , "25652555" , 2025,02,01);
        BabyA b4 = new BabyA("Nilesh" ,"5687546546" , 2025 , 12 , 22);
        System.out.println("New Baby 3 name : " + b3.name);
        System.out.println("New Baby 3 aadhar number : " + b3.aadhar_number);
        System.out.println("New Baby 4 name : " + b4.name);
        System.out.println("New Baby 4 aadhar number : " + b4.aadhar_number);
    }
}

class BabyA{
    String name;
    String aadhar_number;
    int year;
    int month;
    int day;

    BabyA(){
        name = "Gugu";
        aadhar_number = "3652485558";
        year = 1991;
        month = 01;
        day = 02;
    }

    BabyA(String name_user , String aadhar_number_user , int year_user ,int month_user , int day_user){
        this.name = name_user;
        this.aadhar_number = aadhar_number_user;
        this.year = year_user;
        this.month = month_user;
        this.day = day_user;

    }


}
