package recursion;
import java.util.Scanner;
public class NoOfDigit {
    public static int digits(int n){
        if(n==0){
            return 0;
        }
        return 1+digits(n/10);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Number");
        int n=s.nextInt();
        System.out.println("Number of digits: "+digits(n));
    }
}
