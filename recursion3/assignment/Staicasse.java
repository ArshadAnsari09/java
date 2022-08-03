package recursion3.assignment;
import java.util.Scanner;
public class Staicasse {
    public static int staircase(int n) {
        if(n<0){
            return 0;
        }
        if(n==0){
            return 1;
        }
        return staircase(n-1)+staircase(n-2)+staircase(n-3);

    }
    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       int n=s.nextInt();
       int ways=staircase(n);
       System.out.println(ways);
    }
}
