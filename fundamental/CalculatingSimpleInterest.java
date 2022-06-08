package fundamental;
import java.util.Scanner;

public class CalculatingSimpleInterest {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        double si,principal,rate,time;
        principal=input.nextDouble();
        rate=input.nextDouble();
        time=input.nextDouble();
        si=(principal*rate*time)/100;
        System.out.println("Simple Interest=" +si);
    }
}
