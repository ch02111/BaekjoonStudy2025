package p9506;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        while(true) {
            int sum = 0;
            a = sc.nextInt();
            if(a == -1) {
                break;
            }
            for(int i = 1; i < a; i++) {
                if(a % i == 0) {
                    sum += i;
                }
            }
            if (sum == a) {
                System.out.print(a + " = ");
                boolean first = true;
                for (int i = 1; i < a; i++) {
                    if (a % i == 0) {
                        if (!first) System.out.print(" + ");
                        System.out.print(i);
                        first = false;
                    }
                }
                System.out.println();
            } else {
                System.out.println(a + " is NOT perfect.");
            }
        }
    }
}
