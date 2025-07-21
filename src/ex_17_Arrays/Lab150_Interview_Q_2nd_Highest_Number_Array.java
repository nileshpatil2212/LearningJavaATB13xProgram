package ex_17_Arrays;

import java.util.Arrays;

public class Lab150_Interview_Q_2nd_Highest_Number_Array {
    public static void main(String[] args) {

        int[] numbers = {12, 34, 10, 1, 100, 3, 4};

        int second = findSecondLargest(numbers);

        System.out.println("Second Largest Number is: " + second);
    }

    public static int findSecondLargest(int[] arr) {
        int max = arr[0];
        int second = -1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                second = max;
                max = arr[i];
            } else if (arr[i] > second && arr[i] != max) {
                second = arr[i];
            }
        }

        return second;
    }

    }

