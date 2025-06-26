package Test;

public class StringComparisonEquality {
    public static void main(String[] args) {
        String String1 = "Hello";
        String String2 = "hello";
        String String3 = "Hello";

        // equals():
        boolean equalResult = String1.equals(String2);

        // equalsIgnoreCase()
        boolean equalsIgnoreCaseResult = String1.equalsIgnoreCase(String2);

        // compareTo()
        int compareToResult = String1.compareTo(String2);

        // output
        System.out.println("equals(): " + equalResult);
        System.out.println("equalsIgnoreCase(): " + equalsIgnoreCaseResult);
        System.out.println("compareTo(): " + compareToResult);


    }
}
