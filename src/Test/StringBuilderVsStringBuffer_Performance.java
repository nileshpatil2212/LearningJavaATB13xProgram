package Test;

public class StringBuilderVsStringBuffer_Performance {
    public static void main(String[] args) {
        int iterations = 1000;

        //  String concatenation Time
        long startTime = System.currentTimeMillis();
        String s = "";
        for (int i = 0; i < iterations; i++) {
            s += i;
        }
        long endTime = System.currentTimeMillis();
        System.out.println("String : " + (endTime - startTime) + "ms");


        //  StringBuilder Time
        startTime = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            sb.append(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuilder : " +(endTime - startTime )+ "ms" );


        //  StringBuffer Time
        startTime = System.currentTimeMillis();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            sbf.append(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuffer : " +(endTime - startTime )+ "ms" );
    }
}
