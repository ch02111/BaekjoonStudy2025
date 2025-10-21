package p1978;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int count = 0;
        for(int i = 0; i < T; i++) {
            int[] array = new int[T];
            array[i] = sc.nextInt();
            if(array[i] != 1 && !isPrime(array[i])) {
                count++;
            }
        }
        System.out.println(count);
    }

    protected static boolean isPrime(int n) {
        for(int i = 2; i <= (int)Math.sqrt(n); i++) {
            if(n % i == 0)
                return true;
        }
        return false;
    }
}
