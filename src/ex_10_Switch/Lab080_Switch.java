package ex_10_Switch;

import java.util.Scanner;

public class Lab080_Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Day num(1 to 7)");
        int day = scanner.nextInt();

        switch (day) {
            case 1:
                System.out.println("Mon");
                break;
            case 2:
                System.out.println("Tue");
                break;

        }
    }
}
