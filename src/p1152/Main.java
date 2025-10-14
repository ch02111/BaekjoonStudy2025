package p1152;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int count = 0;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != ' ') { // 문자를 만났을 때
                count++;
                while (i < input.length() && input.charAt(i) != ' ') {
                    i++; // 단어가 끝날 때까지 건너뛰기
                }
            }
        }
        System.out.println(count);
    }
}
