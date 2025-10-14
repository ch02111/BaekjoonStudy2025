package p2444;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lines = sc.nextInt();
        for(int i = 1; i <= lines; i++) {
            for(int k = 1; k <= lines - i; k++){
                System.out.print(" ");
            }
            for(int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = lines - 1; i >= 1; i--) {
            for(int k = 1; k <= lines - i; k++) {
                System.out.print(" ");
            }
            for(int k = 1; k <= 2 * i - 1;  k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
