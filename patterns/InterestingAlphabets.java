package patterns;
import java.util.Scanner;
public class InterestingAlphabets {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i=1;
        while(i<=n){
            int j=1;
            char p=(char)('E'-i+1);
            
            while(j<=i){
                System.out.print(p);
                j++;
                p=(char)(p+1);
            }
            System.out.println();
            i++;
        }
    }
}
