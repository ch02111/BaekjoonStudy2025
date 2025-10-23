package p2587;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = new int[5];
        int sum = 0;

        for(int i = 0; i < 5; i++) {
            array[i] = sc.nextInt();
            sum += array[i];
        }

        for(int i = 1; i < 5; i++) {
            for(int j = 0; j < 4; j++) {
                int temp = 0;
                if (array[j] > array[i]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println(sum / 5);
        System.out.println(array[2]);
    }
}
