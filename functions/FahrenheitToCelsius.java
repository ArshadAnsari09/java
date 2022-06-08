package functions;
import java.util.Scanner;
public class FahrenheitToCelsius {
    public static void fahrenheitToCelsius(int start, int end, int step){
        for(int i=start; i<=end; i+=step){
            int celsius=5*(i-32)/9;
            System.out.println(celsius);
        }
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int start=scan.nextInt();
        int end=scan.nextInt();
        int step=scan.nextInt();
        fahrenheitToCelsius(start,end,step);
    }
}
