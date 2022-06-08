package fundamental.problems;

import java.util.Scanner;

public class AverageMarks {
    public static void main(String[] args) {
        Scanner marks = new Scanner(System.in);
        char name= marks.next().charAt(0);
        int marks1,marks2,marks3;
        marks1=marks.nextInt();
        marks2=marks.nextInt();
        marks3=marks.nextInt();
        int average=(marks1+marks2+marks3)/3;
        System.out.println(name);
        System.out.println(average);
    }
}
