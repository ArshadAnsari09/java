package recursion;
import java.util.Scanner;
public class PrintNo {
    public static void printNum(int sum){
        if(sum ==0){
        //    System.out.println(sum);
           return;
        }
        printNum(sum-1);
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Sum of N natural number");
        int sum=s.nextInt();
        printNum(sum);
    }
}
