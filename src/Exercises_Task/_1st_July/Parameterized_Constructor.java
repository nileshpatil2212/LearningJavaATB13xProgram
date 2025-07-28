package Exercises_Task._1st_July;

public class Parameterized_Constructor {
    public static void main(String[] args) {
        Student s1 = new Student("Nilesh" , 25);
        System.out.println(s1.name);
        s1.display();
    }
}

class Student{
    String name;
    int age;

    Student(String name_user , int age_user){
        name = name_user;
        age = age_user;
    }
    void display(){
        System.out.println("Name : " + name  + ", Age : " + age);
    }
}
