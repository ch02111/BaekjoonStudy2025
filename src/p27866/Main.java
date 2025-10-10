package p27866;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char[] array = new char[1000];
        Scanner sc = new Scanner(System.in);
        array = sc.next().toCharArray();
        int input = sc.nextInt() - 1;
        System.out.println(array[input]);
    }
}
