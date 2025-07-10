package ex_09_If_Condition;

public class Lab075_If_P2 {
    public static void main(String[] args) {
        int age = Integer.parseInt(args[0]);
 //       System.out.println(age); // add age from https://prnt.sc/XH79Rbqcx_b4
        if (age > 18){
            System.out.println("yes you can go to GOA!!");
        }
        else {
            System.out.println("You can't go to GOA");
        }
    }
}
