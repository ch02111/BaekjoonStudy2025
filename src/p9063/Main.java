package p9063;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        int[] xPoints = new int[cases];
        int[] yPoints = new int[cases];
        int xMax = -10000;
        int xMin = 10000;
        int yMax = -10000;
        int yMin = 10000;
        for(int i = 0; i < cases; i++) {
            xPoints[i] = sc.nextInt();
            yPoints[i] = sc.nextInt();
        }
        for(int i = 0; i < cases; i++) {
            xMax = Math.max(xMax, xPoints[i]);
            xMin = Math.min(xMin, xPoints[i]);
            yMax = Math.max(yMax, yPoints[i]);
            yMin = Math.min(yMin, yPoints[i]);
        }
        int result = Math.abs(xMax - xMin) * Math.abs(yMax - yMin);
        System.out.println(result);
    }
}
