package p2908;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String[] split_a = a.split("");
        String[] split_b = b.split("");
        String temp = split_a[0];
        split_a[0] = split_a[2];
        split_a[2] = temp;
        temp = split_b[0];
        split_b[0] = split_b[2];
        split_b[2] = temp;
        a = Arrays.stream(split_a).collect(Collectors.joining());
        b = Arrays.stream(split_b).collect(Collectors.joining());
        int integer_a = Integer.parseInt(a);
        int integer_b = Integer.parseInt(b);
        if(integer_a < integer_b)
            System.out.println(b);
        else
            System.out.println(a);
    }
}
