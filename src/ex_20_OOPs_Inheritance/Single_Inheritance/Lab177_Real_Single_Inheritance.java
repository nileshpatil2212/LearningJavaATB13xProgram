package ex_20_OOPs_Inheritance.Single_Inheritance;

public class Lab177_Real_Single_Inheritance {
    public static void main(String[] args) {

        TestCase1 t1 = new TestCase1();
        t1.runningTC1();

        TestCase2 t2 = new TestCase2();
        t2.runningTC2();

        CommonToAll c1 = new CommonToAll();
        TestCase1 t3 = new TestCase1();
        CommonToAll c2 = new TestCase1(); // Dynamic Dispatch (Extends)
//        TestCase1 t4 = new CommonToAll();
    }
}
