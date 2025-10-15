package p2941;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] inputSplit = input.split("");
        int result = input.length();
        for(int i = 0; i < input.length(); i++) {
            if(inputSplit[i].equals("=") && i >= 1) {
                if(inputSplit[i - 1].equals("c") || inputSplit[i - 1].equals("s")) {
                    result = result - 1;
                }
                if(inputSplit[i - 1].equals("z")) {
                    if(i >= 2) {
                        if (inputSplit[i - 2].equals("d"))
                            result = result - 2;
                        else
                            result = result - 1;
                    }
                    else
                        result = result - 1;
                }
            }
            if(inputSplit[i].equals("-") && i >= 1) {
                if(inputSplit[i - 1].equals("c") || inputSplit[i - 1].equals("d")) {
                    result = result - 1;
                }
            }
            if (inputSplit[i].equals("j") && i >= 1) {
                if(inputSplit[i - 1].equals("l") || inputSplit[i - 1].equals("n")) {
                    result = result - 1;
                }
            }
        }
        System.out.println(result);
    }
}
