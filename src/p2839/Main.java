package p2839;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        if(total == 4 || total == 7)
            System.out.println(-1);
        else if(total % 5 == 1 || total % 5 == 3)
            System.out.println(total / 5 + 1);
        else if(total >= 8 && (total % 5 == 2 || total % 5 == 4))
            System.out.println((total / 5) + 2);
        else
            System.out.println(total / 5);
    }
}

// 5의배수 + 1일 때 봉지의 수는 N / 5 + 1이다. 이는 5의배수 + 3일 때도 마찬가지. 3, 6, 8, 11, 13, ...
// N >= 8일 때, 5의 배수 + 2 번째의 봉지의 수는 (N / 5) + (N % 5)이다. 이는 5의 배수 + 4의 경우도 마찬가지. 12, 17, 22, 27, ...
// N = 4, 7일 때는 그냥 무조건 -1.
// 5의 배수는 그냥 N / 5 때리면 됨.
