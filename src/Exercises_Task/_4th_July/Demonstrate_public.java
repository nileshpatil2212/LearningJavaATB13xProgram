package Exercises_Task._4th_July;

public class Demonstrate_public {
    public static void main(String[] args) {
        Students s = new Students();
        s.showinfo();
    }
}

class Students{
    public void showinfo(){
        System.out.println("Public Access: Student Info");
    }
}
