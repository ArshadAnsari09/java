package assignment.String;
import java.util.Scanner;
public class RemoveCharacter {
    public static String takeInput(){
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        return str;
    }
    public static String removeAllOccuranceOfCharacter(String str,char x){
        String out="";
        for(int i=0;i<str.length();i++){
             if(str.charAt(i)!=x){
                 out+=str.charAt(i);
             }
        }
        return out;
    }
    public static void main(String[] args) {
        String str=takeInput();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter character to be removed from all occurances");
        char x=s.next().charAt(0);
        String ans=removeAllOccuranceOfCharacter(str,x);
        System.out.println(ans);
    }
}
