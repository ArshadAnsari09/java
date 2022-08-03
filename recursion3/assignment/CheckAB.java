package recursion3.assignment;
import java.util.Scanner;
public class CheckAB {
    public static boolean checkAB(String str){
        if(str.length()==0){
            return true;
        }

        if(str.charAt(0)=='a'){
            if(str.substring(1).length()>1 && str.substring(1,3).equals("bb")){
                return checkAB(str.substring(3));
            }else{
                return checkAB(str.substring(1));
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        boolean check=checkAB(str);
        System.out.println(check);
    }
}
