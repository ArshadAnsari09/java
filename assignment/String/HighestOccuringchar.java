package assignment.String;
import java.util.Scanner;
public class HighestOccuringchar {
    public static String takeInput(){
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        return str;
    }
    public static char highestOccuringChar(String str){
        int maxFrequency=0;
        int frequency[]=new int[256];
        for(int i=0;i<256;i++){
            frequency[i]=0;
        }
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            frequency[ch]++;
            maxFrequency=Math.max(maxFrequency,frequency[ch] );
        }
        char ch='\0';
        for(int i=0;i<str.length();i++){
            if(frequency[str.charAt(i)]==maxFrequency){
                ch=str.charAt(i);
            }
        }
        return ch;
    }
    public static void main(String[] args) {
        String str=takeInput();
        char out=highestOccuringChar(str);
        System.out.println(out);
    }
}
