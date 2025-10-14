package p2675;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i = 0; i < T; i++) {
            int R = sc.nextInt();
            String S = sc.next();
            String splited[] = new String[20];
            splited = S.split("");
            for(int j = 0; j < S.length(); j++) {
                for(int k = 0; k < R; k++) {
                    System.out.print(splited[j]);
                }
            }
            System.out.println();
        }
    }
}
