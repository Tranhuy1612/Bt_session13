package Bt3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    private static int[][] getArr() {
        int arr[][] = new int[10][10];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 100 );
            }
        }
        return arr;
    }

    private static void printArray(int[][] arr) {
        for (int[] num : arr) {
            System.out.println(Arrays.toString(num));
        }
    }


    public static void main(String[] args) {
        int[][] arr = getArr();
        System.out.println("Mảng 2 chiều");
        printArray(arr);
    }

}
