package p2869;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double A = 0;
        double B = 0;
        double V = 0;
        A = sc.nextLong();    //올라가는 높이
        B = sc.nextLong();     //내려가는 높이
        V = sc.nextLong();     //목표 높이
        int count = 1;
        count = (int)Math.ceil((V - B) / (A - B));

        System.out.println(count);
    }
}
