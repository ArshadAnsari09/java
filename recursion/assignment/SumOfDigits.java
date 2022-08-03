package recursion.assignment;
import java.util.Scanner;
public class SumOfDigits {
    public static int sumOfDigits(int num){
        if(num<10){
            return num;
        }
        return (num%10)+sumOfDigits(num/10);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        int out=sumOfDigits(num);
        System.out.println(out);
    }
}
