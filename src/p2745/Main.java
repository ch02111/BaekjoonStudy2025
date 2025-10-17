package p2745;
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.next();
        int B = sc.nextInt();
        int result = 0;
        char[] array = new char[string.length()];
        for(int i = 0; i < string.length(); i++) {
            array[i] = string.charAt(i);
        }
        for(int i = 0; i < array.length; i++) {
            if(array[i] >= 'A' && array[i] <= 'Z') {
                result += (array[i] - 'A' + 10) * Math.pow(B, array.length - (i + 1));
            }
            else {
                result += Integer.parseInt(String.valueOf(array[i])) * Math.pow(B, array.length - (i + 1));
            }
        }
        System.out.println(result);
    }
}
