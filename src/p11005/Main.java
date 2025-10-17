package p11005;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int B = sc.nextInt();
        String result = "";
        int residue = 0;
        int temp = N;
        for(;temp != 0;) {
            residue = temp % B;
            temp = temp / B;
            if(residue >= 10) {
                result = result.concat(String.valueOf((char)((residue - 10) + 'A')));
            }
            else
                result = result.concat(String.valueOf(residue));
        }
        for(int i = result.length() - 1; i >= 0; i--) {
            System.out.print(result.charAt(i));
        }
    }
}
