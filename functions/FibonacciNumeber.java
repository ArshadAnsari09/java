package functions;
import java.util.Scanner;
public class FibonacciNumeber {
    public static boolean fibonacciNumber(int num){
        int a=0;
        int b=1;
        int c;
        while(a<num){
            c=a+b;
            a=b;
            b=c;
        }
        if(a==num){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        boolean fibonacci=fibonacciNumber(n);
        System.out.println(fibonacci);
    }
}
