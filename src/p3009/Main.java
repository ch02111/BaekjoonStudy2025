package p3009;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();
        int xResult = 0;
        int yResult = 0;
        if(x1 == x2 && x1 != x3)
            xResult = x3;
        else if(x1 == x3 && x1 != x2)
            xResult = x2;
        else if(x2 == x3 && x1 != x3)
            xResult = x1;
        if(y1 == y2 && y1 != y3)
            yResult = y3;
        else if(y1 == y3 && y1 != y2)
            yResult = y2;
        else if(y2 == y3 && y1 != y3)
            yResult = y1;
        System.out.println(xResult + " " + yResult);
    }
}
