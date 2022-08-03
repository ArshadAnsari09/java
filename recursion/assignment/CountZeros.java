package recursion.assignment;
import java.util.Scanner;
public class CountZeros {
    public static int  countZerosRec(int number) {
        if(number<10){
            if(number==0){
                return 1;
            }else{
                return 0;
            }
        }
        if(number %10 == 0){
              return countZerosRec(number/10)+1;
        }else{
            return countZerosRec(number/10);
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int number=s.nextInt();
        int out=countZerosRec(number);
        System.out.println(out);

    }
}
