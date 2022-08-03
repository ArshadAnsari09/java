package recursion2;
import java.util.Scanner;
public class ReplaceCharacter {
    public static String replaceCharacter(String str,char c1,char c2){
        if(str.length()==0){
            return str;
        }
        String ans="";
        if(str.charAt(0) == c1){
           ans=ans+c2; 
        }else{
            ans=ans+str.charAt(0);
        }
        
        String smallAns=replaceCharacter(str.substring(1),c1,c2);
        return ans+smallAns;
    }
   public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       String str=s.nextLine();
       System.out.println("Which character do you want to replce");
       char c1=s.next().charAt(0);
       System.out.println("which character did you want at replaced place");
       char c2=s.next().charAt(0);
       String ans=replaceCharacter(str,c1,c2);
       System.out.println(ans);
   } 
}
