package patterns;
import java.util.Scanner;
public class MirrorImageNumber {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i=1;
        while(i<=n){
            int spaces=1;
            while(spaces<=n-i){
                System.out.print(" ");
                spaces=spaces+1;
            }
            int numbers=1;
            while(numbers<=i){
                System.out.print(numbers);
               numbers++;
            }
            System.out.println();
            i++;
        }
    }
}
