package p11720;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        String input = sc.nextLine();
        int result = 0;
        for(int i = 0; i < T; i++) {
            int splited = Integer.parseInt(input.split("")[i]);
            result += splited;
        }
        System.out.println(result);
    }
}
