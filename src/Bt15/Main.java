package Bt15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập chuỗi");
        String str = sc.nextLine();
        String[] words = str.split("a");
        String max = "";
        for (String word : words) {
            if (word.length() > max.length()) {
                max = word;
            }
        }
        System.out.println("a" + max);

    }
}
