package ex_17_Arrays;

import java.util.Arrays;

public class Lab146_Arrays_Max_Min {
    public static void main(String[] args) {

        // find the maximum element within the array

         int[] array = {25,14,56,15,36,56,77,18,29,49};
//        Arrays.sort(array);
//        System.out.println(array[array.length - 1]);
        int max_output = give_me_max(array);
        int min_output = give_me_min(array);

        System.out.println(max_output);
        System.out.println(min_output);

    }

    static int give_me_max(int[] arrays){
        int max = arrays[0];
        // logic
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] >max){
                max = arrays[i];
            }
        }

        return max;
    }

    static int give_me_min(int[] arrays){
        int min = arrays[0];
        // logic
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] < min){
                min = arrays[i];
            }
        }

        return min;
    }
}
