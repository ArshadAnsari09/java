package fundamental;
import java.util.Scanner;
public class SumOfNumbers {
    public static void main(String[] args) {
        int n;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        int i=1,sum=0;
        while(i<=n){
            sum=sum+i;
            i++;
        
        }
        System.out.println(sum);
    }
}
