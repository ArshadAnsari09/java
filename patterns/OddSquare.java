package patterns;
import java.util.Scanner;
public class OddSquare {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i=1;
        while(i<=n){
           
            int valToPrint=(2*i)-1;
            int j=n;
            while(j>0){
                
                System.out.print(valToPrint);
                valToPrint=valToPrint+2;
                if(valToPrint>(2*n)-1){
                    valToPrint=1;
                }
                j--;
                
            }
            System.out.println();
            i++;
        }
    }
}
