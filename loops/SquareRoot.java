package loops;
import java.util.Scanner;
public class SquareRoot {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int squareRoot=0;
        while(squareRoot*squareRoot <=n){
            squareRoot=squareRoot+1;
        }
        squareRoot=squareRoot-1;
        System.out.println(squareRoot);
    }
}
