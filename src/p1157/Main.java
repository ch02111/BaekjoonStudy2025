package p1157;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        Integer[] count = new Integer[26];
        for(int i = 0; i < 26; i++) {
            count[i] = 0;
        }
        for(int i = 0; i < word.length(); i++) {
            switch(word.charAt(i)) {
                case 'a':
                case 'A': count[0]++; break;
                case 'b':
                case 'B': count[1]++; break;
                case 'c':
                case 'C': count[2]++; break;
                case 'd':
                case 'D': count[3]++; break;
                case 'e':
                case 'E': count[4]++; break;
                case 'f':
                case 'F': count[5]++; break;
                case 'g':
                case 'G': count[6]++; break;
                case 'h':
                case 'H': count[7]++; break;
                case 'i':
                case 'I': count[8]++; break;
                case 'j':
                case 'J': count[9]++; break;
                case 'k':
                case 'K': count[10]++; break;
                case 'l':
                case 'L': count[11]++; break;
                case 'm':
                case 'M': count[12]++; break;
                case 'n':
                case 'N': count[13]++; break;
                case 'o':
                case 'O': count[14]++; break;
                case 'p':
                case 'P': count[15]++; break;
                case 'q':
                case 'Q': count[16]++; break;
                case 'r':
                case 'R': count[17]++; break;
                case 's':
                case 'S': count[18]++; break;
                case 't':
                case 'T': count[19]++; break;
                case 'u':
                case 'U': count[20]++; break;
                case 'v':
                case 'V': count[21]++; break;
                case 'w':
                case 'W': count[22]++; break;
                case 'x':
                case 'X': count[23]++; break;
                case 'y':
                case 'Y': count[24]++; break;
                case 'z':
                case 'Z': count[25]++; break;
            }
        }
        int max = 0;
        int max_location = 0;
        int max_count = 0;
        for(int i = 0; i < 26; i++) {
            if(max < count[i]) {
                max = count[i];
                max_location = i;
                max_count = 1;
            }
            else if(count[i] == max) {
                max_count++;
            }
        }
        char result = (char) (65 + max_location);
        if(max_count == 1) {
            System.out.println(result);
        }
        else if(max_count > 1) {
            System.out.println("?");
        }
    }
}
