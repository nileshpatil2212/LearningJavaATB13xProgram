package ex_17_Arrays;

public class Lab157_Array_Iterate_For_Loop {
    public static void main(String[] args) {

        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};


        System.out.println(matrix.length);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
//                System.out.print(matrix[i][j]  +  " | ");
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
