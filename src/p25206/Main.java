package p25206;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int subjects = 20;          //과목수
        double credit = 0.0;        //학점
        double gpa = 0.0;           //총평점
        double result = 0.0;        //평균평점
        for(int i = 0; i < 20; i++) {
            String input = sc.nextLine();
            String[] inputSplit = input.split(" ");
            switch(inputSplit[2]) {
                case "A+": credit += Double.parseDouble(inputSplit[1]); gpa += Double.parseDouble(inputSplit[1]) * 4.5; break;
                case "A0": credit += Double.parseDouble(inputSplit[1]); gpa += Double.parseDouble(inputSplit[1]) * 4.0; break;
                case "B+": credit += Double.parseDouble(inputSplit[1]); gpa += Double.parseDouble(inputSplit[1]) * 3.5; break;
                case "B0": credit += Double.parseDouble(inputSplit[1]); gpa += Double.parseDouble(inputSplit[1]) * 3.0; break;
                case "C+": credit += Double.parseDouble(inputSplit[1]); gpa += Double.parseDouble(inputSplit[1]) * 2.5; break;
                case "C0": credit += Double.parseDouble(inputSplit[1]); gpa += Double.parseDouble(inputSplit[1]) * 2.0; break;
                case "D+": credit += Double.parseDouble(inputSplit[1]); gpa += Double.parseDouble(inputSplit[1]) * 1.5; break;
                case "D0": credit += Double.parseDouble(inputSplit[1]); gpa += Double.parseDouble(inputSplit[1]) * 1.0; break;
                case "F": credit += Double.parseDouble(inputSplit[1]); gpa += Double.parseDouble(inputSplit[1]) * 0.0; break;
                case "P":
            }
        }
        result = gpa / credit;
        System.out.printf("%.6f", result);
    }
}
