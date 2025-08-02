package Exercises_Task._3rd_July.Method_Overriding;

public class LoginFunctionality {
    public static void main(String[] args) {
        User u1 = new AdminUser();
        User u2 = new RegularUser();
        u1.login();
        u2.login();

    }
}



class User{
    public void login(){
        System.out.println("User Login");
    }
}

class AdminUser extends User{
    @Override
    public void login(){
        System.out.println("Login As a AdminUser");
    }
}

class RegularUser extends User{
    @Override
    public void login(){
        System.out.println("Login As  RegularUser");
    }
}