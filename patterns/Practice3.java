package patterns;
import java.util.Scanner;
public class Practice3 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i=1,p;
        while(i<=n){
             p=i;
             int j=1;
             while(j<=i){
                 System.out.print(p);
                 j++;
                 p--;
             }
             System.out.println();
             i++;
        }
    }
}
