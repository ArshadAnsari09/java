package loops;
import java.util.Scanner;
public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int pow=1;
        int binary=0;
        while(n>0){
           
           
            int lastDigit=n%2;
            binary=binary+lastDigit*pow;
            pow=pow*10;
            n=n/2;
        }
        System.out.println(binary);
    }
}
