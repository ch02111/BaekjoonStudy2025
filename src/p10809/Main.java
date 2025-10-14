package p10809;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] location = new int[26];
        String input = sc.nextLine();
        int length = input.length();
        for(int i = 0; i < 26; i++) {
            location[i] = -1;
        }
        for(int i = 0; i < length; i++) {
            String splited = input.split("")[i];
            switch(splited) {
                case "a" : if(location[0] == -1) location[0] = i; break;
                case "b" : if(location[1] == -1) location[1] = i; break;
                case "c" : if(location[2] == -1) location[2] = i; break;
                case "d" : if(location[3] == -1) location[3] = i; break;
                case "e" : if(location[4] == -1) location[4] = i; break;
                case "f" : if(location[5] == -1) location[5] = i; break;
                case "g" : if(location[6] == -1) location[6] = i; break;
                case "h" : if(location[7] == -1) location[7] = i; break;
                case "i" : if(location[8] == -1) location[8] = i; break;
                case "j" : if(location[9] == -1) location[9] = i; break;
                case "k" : if(location[10] == -1) location[10] = i; break;
                case "l" : if(location[11] == -1) location[11] = i; break;
                case "m" : if(location[12] == -1) location[12] = i; break;
                case "n" : if(location[13] == -1) location[13] = i; break;
                case "o" : if(location[14] == -1) location[14] = i; break;
                case "p" : if(location[15] == -1) location[15] = i; break;
                case "q" : if(location[16] == -1) location[16] = i; break;
                case "r" : if(location[17] == -1) location[17] = i; break;
                case "s" : if(location[18] == -1) location[18] = i; break;
                case "t" : if(location[19] == -1) location[19] = i; break;
                case "u" : if(location[20] == -1) location[20] = i; break;
                case "v" : if(location[21] == -1) location[21] = i; break;
                case "w" : if(location[22] == -1) location[22] = i; break;
                case "x" : if(location[23] == -1) location[23] = i; break;
                case "y" : if(location[24] == -1) location[24] = i; break;
                case "z" : if(location[25] == -1) location[25] = i; break;
            }
        }
        for(int i = 0; i < 26; i++) {
            System.out.print(location[i] + " ");
        }
    }
}
