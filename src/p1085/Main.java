package p1085;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();
        int distanceX = Math.abs(w - x);
        int distanceY = Math.abs(h - y);
        System.out.println(Math.min(Math.min(distanceX, x), Math.min(distanceY, y)));
    }
}
