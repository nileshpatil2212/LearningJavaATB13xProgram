package ex_17_Arrays;

public class Lab153_LabArrayCopy {
    public static void main(String[] args) {

        int[] original = {1,2,3,4,5};

        int[] copy = new int[original.length];
        System.arraycopy(original,0,copy,0,original.length);

    }
}
