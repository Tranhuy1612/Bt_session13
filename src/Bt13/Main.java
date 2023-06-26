package Bt13;

//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Nhập vào chuỗi: ");
//        String input = scanner.nextLine();
//
//        String sortedSubstring = sortSubstring(input);
//        System.out.println("Chuỗi kí tự con được sắp xếp: " + sortedSubstring);
//    }
//
//    public static String sortSubstring(String input) {
//        char[] chars = input.toCharArray();
//
//        // Sắp xếp mảng ký tự theo thứ tự từ bé đến lớn
//        for (int i = 0; i < chars.length - 1; i++) {
//            for (int j = 0; j < chars.length - i - 1; j++) {
//                if (chars[j] > chars[j + 1]) {
//                    char temp = chars[j];
//                    chars[j] = chars[j + 1];
//                    chars[j + 1] = temp;
//                }
//            }
//        }
//
//        // Tạo chuỗi kết quả từ ký tự đầu tiên đến ký tự cuối cùng
//        String sortedSubstring = new String(chars);
//        return sortedSubstring;
//    }
//}

import java.util.*;

public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhập chuỗi :");
//        String str = sc.nextLine();
//
//        List<String> strings= new ArrayList<>();
//        String []chars = str.split("");
//        for (int i = 0; i < chars.length; i++) {
//            if(!chars[i].equals(" ")) {
//                strings.add(chars[i]);
//            }
//        }
//        Collections.sort(strings);
//        System.out.println(strings);
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào 1 chuỗi:");
        String str = sc.nextLine();

        List<String> strings = new ArrayList<>(Arrays.asList(str.replaceAll("\\s", "").split("")));

        Set<String> uniqueStrings = new TreeSet<>(strings);
        System.out.println(strings);
        System.out.println(uniqueStrings);
    }
}