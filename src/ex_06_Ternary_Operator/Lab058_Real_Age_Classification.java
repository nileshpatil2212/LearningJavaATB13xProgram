package ex_06_Ternary_Operator;

public class Lab058_Real_Age_Classification {
    public static void main(String[] args) {
//        age = 23;
//        age < 18 -- > minor;
//        18 < age > 65 - > Adult;
//        Age > 65; -> Sr.Citizen

        int age  = 18;
        String result = (age < 18 ) ? "Minor" : (age < 65) ? "Adult" : "Sr.Citizen";
        System.out.println(result);
    }
}
