package recursion.assignment;
import java.util.Scanner;
public class GeometricSum {
    public static double geometricSum(int k){
        if(k==0){
            return 1;
        }
        return geometricSum(k-1)+1/Math.pow(2,k);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int k=s.nextInt();
        double out=geometricSum(k);
        System.out.println(out);
    }
}
