package ex_18_OOPs;

public class Lab164_Cats {

    Lab164_Cats(){
        System.out.println("DC_In Main Class");
    }
    public static void main(String[] args) {

        cat c1 = new cat();
        new cat();
        cat c2;

        c1.running();
//        c2.running();
        new  cat().running();
    }
}



class cat{
    String name;

    void  running(){
        System.out.println("Running");
    }
}
