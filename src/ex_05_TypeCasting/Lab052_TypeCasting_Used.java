package ex_05_TypeCasting;

import java.util.concurrent.CountDownLatch;

public class Lab052_TypeCasting_Used {
    public static void main(String[] args) {

        int course = 100;
        float GST = 18.45f;
      //  int total = course+GST;
        int total1 = course + (int)GST; //
        System.out.println(total1);


        float total2 = course+GST; // Widening - auto - implicit
        float total3 = (float) course + GST; // widening - explicit
        System.out.println(total2);
        System.out.println(total3);
    }
}
