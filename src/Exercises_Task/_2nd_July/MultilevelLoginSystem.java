package Exercises_Task._2nd_July;

public class MultilevelLoginSystem {
    public static void main(String[] args) {
        SuperAdmin s1 = new SuperAdmin();
        s1.login();
        s1.accessAdminPanel();
        s1.shutdownSystem();

    }
}

class User{
    void login(){
        System.out.println("User Login");
    }
}

class AdminUser extends User{
    void accessAdminPanel(){
        System.out.println("Access Admin Panel");
    }
}

class SuperAdmin extends AdminUser{
    void shutdownSystem(){
        System.out.println("Shutting Down the System");
    }
}