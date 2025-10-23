package p2798;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int goal = sc.nextInt();
        int maximum = 0;
        int[] cards = new int[num];
        for(int i = 0; i < num; i++) {
            cards[i] = sc.nextInt();
        }
        for(int i = 0; i < num - 2; i++) {
            for(int j = i + 1; j < num - 1; j++) {
                for(int k = j + 1; k < num; k++) {
                    int i1 = cards[i] + cards[j] + cards[k];
                    if(i1 == goal){
                        maximum = i1;
                        break;
                    }
                    if (maximum < i1 && i1 < goal) {
                        maximum = i1;
                    }
                }
            }
        }
        System.out.println(maximum);
    }
}
