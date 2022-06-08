package patterns;
import java.util.Scanner;
public class StarPattern {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i=1;
        while(i<=n){
            int spaces=1;
            while(spaces<=n-i){
                System.out.print(" ");
                spaces++;
            }
            // int printStar=1;
            // while(printStar<=i){
            //     System.out.print("*");
            //     printStar++;
            // }
            // int dec=i-1;
            // while(dec>=1){
            //     System.out.print("*");
            //     dec=dec-1;
            // }

            //or
            int j=1;
            while(j<=2*i-1){
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
