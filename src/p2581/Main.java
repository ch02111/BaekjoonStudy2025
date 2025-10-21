package p2581;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int min = -1;
        int sum = 0;
        for(; a <= b; a++) {
            if(isPrime(a) && a > 1) {
                if(min == -1 || min > a)
                    min = a;
                sum += a;
            }
        }
        if(sum != 0)
            System.out.println(sum);
        System.out.println(min);

    }
    protected static boolean isPrime(int n) {
        for(int i = 2; i <= (int)Math.sqrt(n); i++) {
            if(n % i == 0)
                return false;
        }
        return true;
    }
}
