package loops;
import java.util.Scanner;
public class FibonacciNo {
   public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       int num=s.nextInt();
       int a=0,b=1,c;
       for(int i=1; i<=num; i++){
           c=a+b;
           a=b;
           b=c;
          
       }
       System.out.println(a);
   } 
}
