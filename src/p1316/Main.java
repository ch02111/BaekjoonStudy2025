package p1316;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        sc.nextLine();
        int result = cases;
        int[] spellCount = new int[26];
        for(int i = 0; i < cases; i++) {
            for(int j = 0; j < 26; j++) {
                spellCount[j] = 0;
            }
            String input = sc.nextLine();
            char[] inputSplit = input.toCharArray();
            for(int j = 0; j < input.length(); j++) {
                if(j == 0) {
                    spellCount[inputSplit[j] - 97]++;
                    continue;
                }
                if(inputSplit[j] == inputSplit[j - 1]) {
                    spellCount[inputSplit[j] - 97]++;
                }
                else {
                    if(spellCount[inputSplit[j] - 97] == 0) {
                        spellCount[inputSplit[j] - 97]++;
                    }
                    else {
                        result--;
                        break;
                    }
                }
            }
        }
        System.out.println(result);
    }
}
