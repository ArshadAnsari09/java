package recursion2.assignment;
import java.util.Scanner;
public class ReplacePi {
    public static String replacePi(String str){
        String output="";
        if(str.length()<=1){
            return str;
        }
        String small=replacePi(str.substring(1));
        if(str.charAt(0) == 'p' && small.charAt(0)== 'i'){
            output="3.14"+small.substring(1);
        }
        else{
            output=str.charAt(0)+small;
        }
       return output;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        String output=replacePi(str);
        System.out.println(output);
    }
}
