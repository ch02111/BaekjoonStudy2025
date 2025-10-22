package p5073;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        while(true){
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            if(a > b && a > c && a >= b + c) {
                System.out.println("Invalid");
                continue;
            }
            else if(b > a && b > c && b >= a + c) {
                System.out.println("Invalid");
                continue;
            }
            else if(c > a && c > b && c >= a + b) {
                System.out.println("Invalid");
                continue;
            }
            if(a == 0 && b == 0 && c == 0) {
                break;
            }
            else if(a == b && b== c) {
                System.out.println("Equilateral");
            }
            else if(a == b || b == c || a == c) {
                System.out.println("Isosceles");
            }
            else {
                System.out.println("Scalene");
            }
        }
    }
}
