package ex_15_Strings;

public class Lab131_String_Functions {
    public static void main(String[] args) {
        char c = 'A';
        System.out.println(c);

        String s1 = "ABCD";

        System.out.println(s1);
        System.out.println("Uppercase :- " + s1.toUpperCase());
        System.out.println("Lowercase :- " + s1.toLowerCase());
        System.out.println("Concat With E :- " + s1.concat("E"));
        System.out.println("Length :- " + s1.length());
    }
}
