package fundamental;
import java.util.Scanner;
public class TakingInput {
   public static void main(String[] args) {
       int num1,num2;
       Scanner s = new Scanner(System.in);
       num1=s.nextInt();
       num2=s.nextInt();
       int add=num1+num2;
       System.out.println(add);
   }
}
