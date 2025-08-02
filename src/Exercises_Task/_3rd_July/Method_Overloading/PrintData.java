package Exercises_Task._3rd_July.Method_Overloading;

public class PrintData {
    public static void main(String[] args) {
        Printer p1 = new Printer();
        p1.printData("Hello World");
        p1.printData(100);
        p1.printData(3.14f);
    }
}


class Printer{
    void printData(String data){
        System.out.println("String Data : " + data);
    }

    void printData(int data){
        System.out.println("Integer Data : " + data);
    }

    void printData(float data){
        System.out.println("float data : " + data);
    }
}

