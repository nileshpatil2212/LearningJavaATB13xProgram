package ex_14_Functions;

public class Lab125_UD_Part1 {

    // User Defined Functions.

    // 1.Without Parameters and Without Return Type
    // 2.Without Parameters but With Return Type
    // 3.With Parameters and Without Return Type
    // 4. With Parameters and With Return Type

    public static void main(String[] args) {
        // 1. without parameter and without return type .
        wp_wr_greet();

        // 2. without parameter but with return type
        String msg = greet_with_hello_wp_with_RT();
        System.out.println(msg);

        // 3. with parameter and without return type
        greet_with_details("Nilesh",25,5000);
        greet_with_details("Pramod",28,7000);

        // 4. with parameter with return type
        int sum = sum_of_two_numbers(3,4);
        int sum2 = sum_of_two_numbers(10,20);
        int sum3= sum_of_two_numbers(30,40);
        int sum4 = sum_of_three_numbers(30,40,80);

        System.out.println(sum);
        System.out.println(sum2);
        System.out.println(sum3);
        System.out.println(sum4);

        int result = Math.max(3,4); // 4th Type : with Return type, which argument


    }
    // 1. without parameter and without return type .(Declare) define.
        static void wp_wr_greet(){
            System.out.println("-- Type.1 : Without parameter Without return Type --");
            System.out.println("Hi , How Are you ?");
        }

    // 2. without parameter but with return type
        static String  greet_with_hello_wp_with_RT(){
            System.out.println("-- Type.2 : Without parameter but with return Type --");
            System.out.println("wp_with_RT");
            return "Hiii , How Are you ? ";
        }

    // 3. with parameter and without return type (90% used)
        static void greet_with_details(String name , int age , double salary){
            System.out.println("Your name is : " + name + "\nYour age is : " + age + "\nYour Salary is : " + salary);
        }

    // 4. with parameter with return type
        static int sum_of_two_numbers(int a , int b){
            return a+b;
        }

    static int sum_of_three_numbers(int a , int b,int c){
        return a+b+c;
    }





}
