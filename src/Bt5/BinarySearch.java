package Bt5;

import java.util.Scanner;

public class BinarySearch {
    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        while (high >= low) {
            int mid = (high + low) / 2;
            if (target < arr[mid]) {
                high = mid - 1;
            } else if (target == arr[mid]) {
                return mid;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.print("Nhập giá trị cần tìm: ");
        Scanner scanner = new Scanner(System.in);
        int target = scanner.nextInt();

        int result = binarySearch(arr, target);

        if (result == -1) {
            System.out.println("Không tìm thấy giá trị trong mảng.");
        } else {
            System.out.println("Giá trị được tìm thấy tại vị trí: " + result);
        }
    }
}
