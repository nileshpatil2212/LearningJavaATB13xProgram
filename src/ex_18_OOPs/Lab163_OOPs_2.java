package ex_18_OOPs;

public class Lab163_OOPs_2 {

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2;
        new Student();

//        s1.name = "pramod";
//        System.out.println(s1.name);
    }
}

    class Student{
    String name;
    Student(){
        System.out.println("Default Constructor");
    }

    void sleep(){
        System.out.println("Sleeping");
    }
}
// We can create N number of classes 
//class a{
//
//}
