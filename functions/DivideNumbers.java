package functions;
import java.util.Scanner;
public class DivideNumbers {
    public static double divideNumbers(int num, int deno){
        if(deno==0){
            System.out.println("Inside if");
            return Integer.MIN_VALUE;
        }
        return (double)num/deno;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        int deno=s.nextInt();
        double divide=divideNumbers(num,deno);
        System.out.println(divide);
    }
}
