package p1436;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int count = 0;
        int result = 0;
        while(true) {
            count++;
            if(String.valueOf(count).contains("666")) {
                result++;
            }
            if(result == input) {
                System.out.println(count);
                break;
            }
        }
    }
}
