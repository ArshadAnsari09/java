package test2;

import java.util.Scanner;

public class NumberStarPattern {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int numStar=0;

        int i=1;
        while(i<=n){
            int j=1;
            while(j<=n-i+1){
                System.out.print(j);
                j++;
            }
            int star=1;
            while(star<=numStar){
                System.out.print("*");
                star++;

            }
            j=n-i+1;
            while(j>=1){
                System.out.print(j);
                j--;
            }
            System.out.println();
            i++;
            numStar+=2;
        }
        
    }
}
