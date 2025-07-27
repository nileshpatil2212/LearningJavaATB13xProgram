package ex_19_OOPs_Constructor;

public class Lab170_OOPs_Constructor {
    public static void main(String[] args) {
        Baby b1 = new Baby();
    }


}


class Baby{
    String name;
    Baby(){
        System.out.println("I am called , Default Constructor");
        System.out.println("Your Aadhar Number is Ready !!");

        // Fetch data from the MySQL database...
        // Read from CSV File , XLSX
        // Open a file and read the data. (json, testdata.xlsx, txt file)

    }

    void m1(){
        System.out.println("Hi M1");
    }


    void cry(){
        System.out.println("cry");
    }

    void sleep(){
        System.out.println("sleep");
    }

    void eat(){
        System.out.println("eat");
    }


}