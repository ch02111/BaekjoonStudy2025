package p2292;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long destination = sc.nextLong();
        int i = 1;
        for(int j = 1; true; j++) {
            if(destination <= i) {
                System.out.println(j);
                break;
            }
            i = 3 * j * j + 3 * j + 1;
        }
    }
}
