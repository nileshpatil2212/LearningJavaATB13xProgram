package ex_11_Loop;

public class Lab105_For_Loop_Continue {
    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) {
            if (i == 5){
                continue;  // Skip the code and Move to next to top.
            }
            System.out.println(i);

            
        }
    }
}
