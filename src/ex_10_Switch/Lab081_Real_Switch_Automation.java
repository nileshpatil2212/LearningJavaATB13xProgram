package ex_10_Switch;

import java.util.Scanner;

public class Lab081_Real_Switch_Automation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the browser , Which you want to start : ");
        String browser = scanner.next();
        browser = browser.toLowerCase();
        browser = browser.toUpperCase();

        switch (browser){
            case "Chrome" :
                System.out.println("Starting the Chrome");
                System.out.println(".............");
                System.out.println("TC1");
                System.out.println("TC2");
                break;

            case "Firefox" :
                System.out.println("Starting the Firefox");
//                webdriver driver = new firefox();
                break;

            case  "Edge" :
                System.out.println("Starting the Edge");
                break;

            default:
                System.out.println("I have no idea which browser is this");
                break;
        }
    }
}
