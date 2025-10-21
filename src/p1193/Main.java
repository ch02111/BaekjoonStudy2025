package p1193;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();

        int line = 1;  // 몇 번째 대각선인지
        int count = 0; // 지금까지의 분수 개수 누적

        // X가 속한 대각선(line)을 찾는다
        while (true) {
            if (X <= count + line) break;
            count += line;
            line++;
        }

        int offset = X - count - 1;  // 대각선 내에서의 위치 (0부터 시작)

        int numerator, denominator;
        // line이 홀수면 위에서 내려오고, 짝수면 아래에서 올라감
        if (line % 2 == 1) {
            numerator = line - offset;
            denominator = 1 + offset;
        } else {
            numerator = 1 + offset;
            denominator = line - offset;
        }

        System.out.println(numerator + "/" + denominator);
    }
}
