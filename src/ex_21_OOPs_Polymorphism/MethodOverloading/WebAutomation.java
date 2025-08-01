package ex_21_OOPs_Polymorphism.MethodOverloading;

public class WebAutomation {
    public static void main(String[] args) {
        Browser b1 = new Browser();
        b1.startBrowser();
        b1.startBrowser("Chrome");
    }
}

class Browser{

    void startBrowser(){
        System.out.println("Starting the Browser");
    }

    String startBrowser(String browser){
        System.out.println("Starting Browser : " + browser);
        return browser;
    }
}
