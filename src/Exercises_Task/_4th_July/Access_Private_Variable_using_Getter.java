package Exercises_Task._4th_July;

public class Access_Private_Variable_using_Getter {
    public static void main(String[] args) {
        person p = new person();
        System.out.println("Accessing private variable using getter: " + p.getName());

    }
}

class person{
    private String name = "Nilesh Patil";

    public String getName() {
        return name;
    }

}
