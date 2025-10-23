package p25305;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int k = sc.nextInt();
        int[] scores = new int[N];

        for (int i = 0; i < N; i++)
            scores[i] = sc.nextInt();

        for(int i = 1; i < N; i++) {
            for(int j = 0; j < N - 1; j++) {
                int temp = 0;
                if (scores[j] > scores[i]) {
                    temp = scores[i];
                    scores[i] = scores[j];
                    scores[j] = temp;
                }
            }
        }
        System.out.println(scores[N - k]);
    }
}
