package assignment.String;
import java.util.Scanner;
public class ReverseEachWord {
    public static String takeInput(){
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        return str;
    }
    public static String reverseWord(String str,int start,int end){
     String out="";
     while(start<end){
         out=str.charAt(start)+out;
         ++start;
     }
     return out;
    }
    public static String reverseEachWord(String str){
        int previousSpaceIndex=-1;
        String ans="";
        int i=0;
        for(;i<str.length();i++){
            if(str.charAt(i)==' '){
                ans+=(reverseWord(str,previousSpaceIndex+1,i)+" ");
                previousSpaceIndex=i;
            }
        }
        ans+=(reverseWord(str,previousSpaceIndex+1,i)+" ");
        return ans;
    } 
    public static void main(String[] args) {
        String str=takeInput();
        String ans=reverseEachWord(str);
        System.out.println(ans);
    }
}
