package ex_20_OOPs_Inheritance.Hierarchical;

import ex_20_OOPs_Inheritance.Multiple_Inheritance.Father_f1;

public class Lab180_Hierarchical {
    public static void main(String[] args) {

        father f1 = new father();
        ruhani r1 = new ruhani();
        r1.home();
        f1.home();

        pramod p1 = new pramod();
        p1.home();

        lucky l1 = new lucky();
//        l1.l2();
        l1.home();
    }
}

class father{
    void home(){
        System.out.println("3BHK");
    }
}

class pramod extends father{
    void home2(){
        System.out.println("H2 - Pramod");
    }
}

class lucky extends father{
    void home3(){
        System.out.println("H3 - lucky");
    }
}

class ruhani extends father{
    void home4(){
        System.out.println("H4 - ruhani");
    }
}