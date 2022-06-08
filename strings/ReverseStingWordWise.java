package strings;
import java.util.Scanner;
public class ReverseStingWordWise {
    public static String takeInput(){
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        return str;
    }
    public static String reverseString(String str){
    
        // int end=str.length();
        // int i=str.length()-1;
        // String ans="";
        // while(i>=0){
        //     if(str.charAt(i)==' '){
        //         ans=ans+str.substring(i+1, end)+ " ";
        //         end=i;
        //     }
        //     i--;
        // }
        // ans=ans+str.substring(i+1, end);
        String ans="";
        for(int i=0;i<=str.length()-1;i++){
            ans=str.charAt(i)+ans;
        }
        String output="";
        int currentWordStart=0;
        int i=0;
        for(;i<ans.length();i++){
            if(ans.charAt(i)==' '){
                 //reverse current word
                 String reversedWord="";
                 int currentWordEnd=i-1;
                 for(int j=currentWordStart;j<=currentWordEnd;j++){
                          reversedWord=ans.charAt(j)+reversedWord;
                 }
                 //add to String
                 output+=reversedWord+" ";
                 currentWordStart=i+1;
            }
        }
        String reversedWord="";
        int currentWordEnd=i-1;
        for(int j=currentWordStart;j<=currentWordEnd;j++){
                 reversedWord=ans.charAt(j)+reversedWord;
        }
        //add to String
        output+=reversedWord;
        return output;
    }              
    public static void main(String[] args) {
        String str=takeInput();
        String result=reverseString(str);
        System.out.println(result);
    }
}
