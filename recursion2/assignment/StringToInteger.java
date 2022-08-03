package recursion2.assignment;
import java.util.Scanner;
public class StringToInteger {
    public static int convertStringToInteger(String str){
        if(str.length()==1){
            return str.charAt(0)-'0';
        }
        int smallOutput=convertStringToInteger(str.substring(0,str.length()-1));
        int lastDigit=str.charAt(str.length()-1)- '0';
        return smallOutput*10+lastDigit;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        int ans=convertStringToInteger(str);
        System.out.println(ans);
    }
}
