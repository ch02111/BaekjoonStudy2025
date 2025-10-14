package p11654;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        char ascii = string.charAt(0);
        int result = (int)ascii;
        System.out.println(result);
    }
}
