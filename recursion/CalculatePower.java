package recursion;
import java.util.Scanner;
public class CalculatePower {
    public static int calculatePower(int x, int n){
        if(x==0 && n==0){
            return 0;
        }
        if(x==0){
            return 0;
        }
        if(n==0){
            return 1;
        }
        return x*calculatePower(x,n-1);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the value of x");
        int x=s.nextInt();
        System.out.println("Enter the value of n");
        int n=s.nextInt();
        int ans=calculatePower(x,n);
        System.out.println(ans);
        
    }
}
