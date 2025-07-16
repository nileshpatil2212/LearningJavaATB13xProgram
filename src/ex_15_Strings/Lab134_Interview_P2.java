package ex_15_Strings;

public class Lab134_Interview_P2 {
    public static void main(String[] args) {

        String s1 = "Hello";
        String s4 = "Hello"; // SCP --> 1

        String s2 = new String("Hello"); // OA 1
        String s3 = new String("Hello"); // OA 2
        String s5 = new String("hello"); // OA 3

        // Comparison -> String -> this check the location reference.

        System.out.println(s1 == s3);
        System.out.println(s1 == s2);
        System.out.println(s2 == s3);

        System.out.println(s1 == s4);
        System.out.println(s2 == s3);

    //  Equals( content ) -> value

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s3.equals(s5));
        System.out.println(s3.equalsIgnoreCase(s5));



    }
}
