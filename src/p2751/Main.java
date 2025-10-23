package p2751;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cases = Integer.parseInt(br.readLine());

        int[] array = new int[cases];
        for(int i = 0; i < cases; i++) {
            array[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(array);

        for(int i = 0; i < cases; i++) {
            System.out.println(array[i]);
        }
    }
}
