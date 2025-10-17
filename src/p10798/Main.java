package p10798;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] array = new String[5];
        for(int i = 0; i < 5; i++) {
            array[i] = sc.nextLine();
        }
        int maxLen = 0;
        for(int i = 0; i < 5; i++) {
            if(array[i].length() > maxLen)
                maxLen = array[i].length();
        }
        for(int col = 0; col < maxLen; col++) {
            for(int row = 0; row < 5; row++) {
                if(col < array[row].length()) {
                    System.out.print(array[row].charAt(col));
                }
            }
        }
    }
}
