package assignment.String;
import java.util.Scanner;
public class CompressString{
        public static String takeInput(){
            Scanner s=new Scanner(System.in);
            String str=s.nextLine();
            return str;
        }
        public static String compressedString(String str){
            String ans="";
            if(str.length()==0){
                return ans;
            }
            int currentCharCount=1;
            ans+=str.charAt(0);
            for(int i=1;i<str.length();++i){
                if(str.charAt(i)==str.charAt(i-1)){
                    ++currentCharCount;
                }else{
                    if(currentCharCount>1){
                        ans+=currentCharCount;
                        currentCharCount=1;
                    }
                    ans+=str.charAt(i);
                }
            }
            if(currentCharCount>1){
                ans+=currentCharCount; 
            }
            return ans;
        }
        public static void main(String[] args) {
            String str=takeInput();
            String out=compressedString(str);
            System.out.println(out);
        }
}
