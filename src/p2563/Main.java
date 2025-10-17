package p2563;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int papers = sc.nextInt();
        int result = 0;
        int[][] white = new int[100][100];
        for(int i = 0; i < 100; i++) {
            for(int j = 0; j < 100; j++) {
                white[i][j] = 0;
            }
        }
        for(int i = 0; i < papers; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            for(int j = 0; j < 10; j++) {
                for(int k = 0; k < 10; k++) {
                    white[x + j][y + k] = 1;
                }
            }
        }
        for(int i = 0; i < 100; i++) {
            for(int j = 0; j < 100; j++) {
                if(white[i][j] == 1) {
                    result++;
                }
            }
        }
        System.out.println(result);
    }
}
