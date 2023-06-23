package workshop6;

import java.util.Scanner;

public class Inputter {

    public static Scanner sc = new Scanner(System.in);
//Get an integer between min... max

    public static int inputInt(String msg, int min, int max) {
        if (min > max) { // biến tạm cho phép swap giá trị biến
            int t = min;
            min = max;
            max = t;
        }
        int data;
        do {
            System.out.print(msg);
            data = Integer.parseInt(sc.nextLine());
        } while (data < min || data > max);
        return data;
    }

    public static String inputStr(String msg) {
        System.out.print(msg);
        String data = sc.nextLine();
        return data; //hàm có đầu vào phải có đầu ra
    }

    //get a non-blank string 
    public static String inputNonBlankStr(String msg) {
        String data;
        do {
            System.out.print(msg);
            data = sc.nextLine();
        } while (data.length() == 0);
        return data;
    }

    //Get a string following a pattern
    public static String inputPattern(String msg, String pattern) {
        String data;
        do {
            System.out.print(msg);
            data = sc.nextLine();
        } while (!data.matches(pattern));
        return data;
    }

}
