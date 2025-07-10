package ex_07_UserInput;

public class Lab060_UserInput_CLI {
    public static void main(String[] args) {

        String age_string = args[0];
        System.out.println(age_string);
        int age = Integer.parseInt(age_string);
    //    int age = 65;
        String CanIVote = age >= 18 ? "Yes" : "No";
        System.out.println(CanIVote);
    }
}
