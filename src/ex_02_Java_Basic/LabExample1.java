package ex_02_Java_Basic;

public class LabExample1 {
    public static void main(String[] args) {
        int a = 10;
        {
            int b = 10;
            System.out.println(b);
        }
        int b = 90;
        System.out.println(b);
    }
}
