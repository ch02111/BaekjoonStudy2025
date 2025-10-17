package p2903;
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int result = (int)Math.pow(Math.pow(2, N) + 1, 2);
        System.out.println(result);
    }
}
