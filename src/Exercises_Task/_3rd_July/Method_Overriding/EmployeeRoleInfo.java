package Exercises_Task._3rd_July.Method_Overriding;

public class EmployeeRoleInfo {
    public static void main(String[] args) {
        Employee e1 = new Manager();
        Employee e2 = new clerk();
        Employee e3 = new tester();

        e1.role();
        e2.role();
        e3.role();

    }
}

class Employee{
    public void role(){
        System.out.println("General Employee");
    }
}

class Manager  extends Employee{
    @Override
    public void role(){
        System.out.println("Employee is manager");
    }
}

class clerk extends Employee{
    @Override
    public void role(){
        System.out.println("Employee is clerk");
    }
}

class tester extends Employee{
    @Override
    public void role(){
        System.out.println("Employee is tester");
    }
}

