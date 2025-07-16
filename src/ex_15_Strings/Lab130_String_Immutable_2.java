package ex_15_Strings;

public class Lab130_String_Immutable_2 {
    public static void main(String[] args) {
        String s1 = "Hello";
        //s1.concat("World");
        s1 = s1.concat("World");
        System.out.println(s1);
    }
}
