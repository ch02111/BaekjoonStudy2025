package p2566;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[9][9];
        int maxValue = 0;
        int maxRow = 0;
        int maxCol = 0;
        for(int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++) {
                matrix[i][j] = sc.nextInt();
                if(maxValue < matrix[i][j]) {
                    maxValue = matrix[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        }
        maxRow += 1;
        maxCol += 1;
        System.out.println(maxValue);
        System.out.println(maxRow + " " + maxCol);
    }
}
