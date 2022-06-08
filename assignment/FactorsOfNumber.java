package assignment;

import java.util.Scanner;

public class FactorsOfNumber {
    public static void main(String[] args) {
        int num, i;
        Scanner s = new Scanner(System.in);
        num = s.nextInt();
        i = 2;
        while (i < num) {
            if (num % i == 0) {

                System.out.println(i);

            }
            i++;
        }

    }
}
