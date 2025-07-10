package ex_10_Switch;

public class Lab088_JDK13 {
    public static void main(String[] args) {
        int itemcode = 006;

        switch (itemcode){
            case 001,002,005 :
                System.out.println("this is Electronic gadget");
                break;
            case 004,006,007 :
                System.out.println("this is mech gadget");
                System.out.println("this is 006_mech gadget");
                break;
        }
    }
}
