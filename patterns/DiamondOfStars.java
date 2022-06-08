package patterns;
import java.util.Scanner;
public class DiamondOfStars {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int n1=(n+1)/2;
        int n2=n1-1;
        int i=1;
        while(i<=n1){
            //1st half
            int spaces=1;
            
            while(spaces<=n1-i){
                System.out.print(" ");
                spaces++;
            }
            int stars=1;
            while(stars<=2*i-1){
                System.out.print("*");
                stars++;
            }
            System.out.println();
            i++;
        }
            //2nd half
            i=n2;
            while(i>=1){
           
            int spaces=1;
            while(spaces<=n2-i+1){
                System.out.print(" ");
                spaces++;

            }
            int stars=1;
            while(stars<=2*i-1){
                System.out.print("*");
                stars++;
            }
            System.out.println();
            i--;
       }
    }
    
}
