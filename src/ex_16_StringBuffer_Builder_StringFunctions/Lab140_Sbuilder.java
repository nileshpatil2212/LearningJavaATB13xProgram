package ex_16_StringBuffer_Builder_StringFunctions;

public class Lab140_Sbuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append("World");
        sb.reverse();
        System.out.println(sb);
    }
}
