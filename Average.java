package functions;
import java.util.Scanner;
public class Average {
    public static double average(int n1,int n2,int n3){
        double ans=(double)(n1+n2+n3)/3;
        return ans;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int num1=s.nextInt();
        int num2=s.nextInt();
        int num3=s.nextInt();
        double avg=average(num1,num2,num3);
        System.out.println(avg);
    }
}
