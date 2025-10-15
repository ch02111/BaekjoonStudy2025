package p2738;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] matrix1 = new int[row][col];
        int[][] matrix2 = new int[row][col];
        int[][] result = new int[row][col];
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++)
                System.out.print(result[i][j] + " ");
            System.out.println();
        }
    }
}
