package ex_02_Java_Basic;

public class Lab017_PrintF {
    public static void main(String[] args) {
        int a = 10;
        System.out.print("Print comment Print Without New Line");
        System.out.println("Println comment Print With New Line");
        System.out.println("Add the new line in the end");

        System.out.println(a);
        System.out.printf("Your variable name is %d" , a);

        // %d -> int, byte, long, short, - data type
        // %s -> String
        // %f -> float, double,
        // %b ->boolean

        int b = 20;
        System.out.println("---------");
        System.out.printf("%d + %d" ,a,b);
    }
}
