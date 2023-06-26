package Bt6;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    private static Integer[] getArr() {
        Integer arr[] = new Integer[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        Arrays.sort(arr, Collections.reverseOrder());
        return arr;
    }

    private static void printArray(Integer[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static int binarySearch(Integer[] arr, int low, int high, int value) {
        if (high >= low) {
            int mid = (high + low) / 2;
            if (arr[mid] == value) {
                return mid;
            }
            if (arr[mid] > value) {
                return binarySearch(arr, mid + 1, high, value);

            }
            return binarySearch(arr, low, mid - 1, value);

        }
        return -1;
    }

    public static void main(String[] args) {
        Integer[] arr = getArr();
        System.out.println("Mang duoc tao ra:");
        printArray(arr);

        System.out.println("nhập giá trị cần tìm");
        Scanner scanner = new Scanner(System.in);
        int target = scanner.nextInt();

        int index = binarySearch(arr, 0, arr.length - 1, target);
        if (index != -1) {
            System.out.println("Phan tu " + target + " co ton tai trong mang tai vi tri " + index);
        } else {
            System.out.println("Phan tu " + target + " khong ton tai trong mang");
        }
    }
}
