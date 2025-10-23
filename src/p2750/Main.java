package p2750;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        int min = 1001;
        int[] array = new int[cases];
        for(int i = 0; i < cases; i++) {
            array[i] = sc.nextInt();
        }
        for(int i = 1; i < cases; i++) {
            for(int j = 0; j < cases - 1; j++) {
                int temp = 0;
                if (array[j] > array[i]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        for(int i = 0; i < cases; i++) {
            System.out.println(array[i]);
        }
    }
}
