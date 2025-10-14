package p10988;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        boolean result = true;
        for(int i = 0; i < str.length() / 2; i++) {
            if(str.charAt(i) != str.charAt(str.length() - i - 1))
                result = false;

        }
        if(result) {
            System.out.println("1");
        }
        else {
            System.out.println("0");
        }
    }
}

