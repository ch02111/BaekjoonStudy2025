package p2720;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        for(int i = 0; i < cases; i++) {
            int quarter = 0;
            int dime = 0;
            int nickel = 0;
            int penny = 0;
            int residue = sc.nextInt();
            quarter = residue / 25;
            residue -= quarter * 25;
            dime = residue / 10;
            residue -= dime * 10;
            nickel = residue / 5;
            residue -= nickel * 5;
            penny = residue;
            System.out.println(quarter + " " + dime + " " + nickel + " " + penny);
        }
    }
}
