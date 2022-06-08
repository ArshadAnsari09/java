package assignment;
import java.util.Scanner;
public class SumOfEvenAndOdd {
    public static void main(String[] args) {
        int n;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        int evenSum=0,oddSum=0;
        while(n>0){
            int rem=n%10;
            if(rem%2==0){
                evenSum=evenSum+rem;
            }
            else{
                oddSum=oddSum+rem;
            }
            n=n/10;
        }
        System.out.println(evenSum+ "\t" +oddSum);
        
    }
}
