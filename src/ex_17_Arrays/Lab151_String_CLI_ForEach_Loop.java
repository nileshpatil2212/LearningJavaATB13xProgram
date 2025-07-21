package ex_17_Arrays;

public class Lab151_String_CLI_ForEach_Loop {
    public static void main(String[] args) {

        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);

        }
        System.out.println(" ------- ");
        for (Object o:args){
            System.out.println(o);
        }

//        for (String arg :args){
//            System.out.println(arg);
//        }
    }
}
