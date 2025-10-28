package p1427;

import mergesort.MergeSort;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputString = br.readLine();
//        long input = Long.parseLong(inputString);
        Integer[] array = new Integer[inputString.length()];
        for (int i = 0; i < inputString.length(); i++) {
            array[i] = inputString.charAt(i) - '0';
        }

        Arrays.sort(array, Collections.reverseOrder());

        for (int i = 0; i < inputString.length(); i++) {
            System.out.print(array[i]);
        }
    }
}