package ex_10_Switch;

public class Lab087_JDK13Above {
    public static void main(String[] args) {
        int itemcode = 001;
        switch (itemcode){
            case 001 -> System.out.println("001"); // works only in single line
            case 002 -> System.out.println("002");
            case 003 -> System.out.println("003");
            default -> System.out.println("Defaukt");
        }
    }
}
