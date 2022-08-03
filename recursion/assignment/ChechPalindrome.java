package recursion.assignment;
import java.util.Scanner;
public class ChechPalindrome {
    public static boolean checkPalindrome(String str){
        if(str.length()<=1){
            return true;
        }
        if(str.charAt(0)==str.charAt(str.length()-1)){
            return checkPalindrome(str.substring(1,str.length()-1));
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        boolean out=checkPalindrome(str);
        System.out.println(out); 
    }
}
