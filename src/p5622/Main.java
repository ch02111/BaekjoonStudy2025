package p5622;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int total = 0;
        for(int i = 0; i < input.length(); i++) {
            if(input.charAt(i) >= 'A' && input.charAt(i) <= 'C') {
                total += 3;
            }
            else if(input.charAt(i) >= 'D' && input.charAt(i) <= 'F') {
                total += 4;
            }
            else if(input.charAt(i) >= 'G' && input.charAt(i) <= 'I') {
                total += 5;
            }
            else if(input.charAt(i) >= 'J' && input.charAt(i) <= 'L') {
                total += 6;
            }
            else if(input.charAt(i) >= 'M' && input.charAt(i) <= 'O') {
                total += 7;
            }
            else if(input.charAt(i) >= 'P' && input.charAt(i) <= 'S') {
                total += 8;
            }
            else if(input.charAt(i) >= 'T' && input.charAt(i) <= 'V') {
                total += 9;
            }
            else if(input.charAt(i) >= 'W' && input.charAt(i) <= 'Z') {
                total += 10;
            }
        }
        System.out.println(total);
    }
}
