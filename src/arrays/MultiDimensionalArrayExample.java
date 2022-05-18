package javatrainning.arrays;

public class MultiDimensionalArrayExample {
    public static void main (String [] args) {
        int[][] arr = {{1, 2, 54,34}, {3, 2, 54,45}, {1, 2, 3,45},{1,2,3,4}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] * arr[i][j] +" ");
            }
            System.out.println();

        }

    }
}
