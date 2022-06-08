package fundamental;
import java.util.Scanner;
public class FahrenheitToCelsius {
    public static void main(String[] args) {
        int start,end,gap,celsius;
        Scanner s=new Scanner(System.in);
        start=s.nextInt();
        end=s.nextInt();
        gap=s.nextInt();
        int f=start;
        while(f<=end){
            celsius=(5*(f-32))/9;
            System.out.println(f +"\t" +celsius);
            f=f+gap;
        }
    }
}
