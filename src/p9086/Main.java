package p9086;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int T;
        Scanner sc = new Scanner(System.in);
        T = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < T; i++) {
            String string = sc.nextLine();
            int length = string.length();
            String start = String.valueOf(string.charAt(0));
            String end = String.valueOf(string.charAt(length - 1));
            System.out.println(start + end);
        }
    }
}
