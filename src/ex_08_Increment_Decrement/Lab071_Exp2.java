package ex_08_Increment_Decrement;

public class Lab071_Exp2 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a + ++a);
        System.out.println(a);
//        ++a -> A -> ExpA -> 11 , a -> 11
//        ++a -> B -> ExpB -> 12 , a -> 12
    }
}
