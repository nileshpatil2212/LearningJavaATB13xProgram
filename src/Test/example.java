package Test;

public class example {
    public static void main(String[] args) {
        for (int i = 1; i <= 2; i++) {
            inner:
            for (int j = 1; j <= 2; j++) {
                if (j > i)
                    break inner;
                System.out.print(j + ",");
            }
        }
    }
}
