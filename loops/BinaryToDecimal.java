package loops;
import java.util.Scanner;
public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int pow=1,decimal=0;
        while(n>0){
            int lastDigit=n%10;
            decimal=decimal+lastDigit*pow;
            pow=pow*2;
            n=n/10;
        }
        System.out.println(decimal);
    }
}
