package p10811;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int N, M, i, j;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        int[] array = new int[N];
        for(int a = 0; a < N; a++) {
            array[a] = a + 1;
        }
        for(int a = 0; a < M; a++) {
            i = sc.nextInt() - 1;
            j = sc.nextInt() - 1;
            for(int b = i; b < (i + j) / 2 + 1; b++) {
                int temp = array[b];
                array[b] = array[i + j - b];
                array[i + j - b] = temp;
            }
        }
        for(int a = 0; a < N; a++) {
            System.out.printf("%d ", array[a]);
        }
    }
}
