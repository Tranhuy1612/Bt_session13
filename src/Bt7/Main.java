package Bt7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] list = {"Huy", "Hai", "Binh"};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi cần tìm kiếm :");
        String listSearch = scanner.nextLine();

        boolean flag = true;
        for (int i = 0; i < list.length; i++) {
            if (list[i].equals(listSearch)) {
                System.out.println("chuỗi " + listSearch + " được tìm thấy tại vị trí " + i);
                flag = false;
                break;
            }
        }
        if (flag ) {
            System.out.println("ko Có trong mảng  ");
        }
    }
}
