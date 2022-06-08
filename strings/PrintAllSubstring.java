package strings;
import java.util.Scanner;
public class PrintAllSubstring {
    public static String takeInput(){
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        return str;
    }
    public static void printSubstring(String str){
        for(int i=0;i<str.length();i++){
            for(int j=i;j<str.length();j++){
                System.out.println(str.substring(i,j+1));
            }
        }
        // for(int len=1; len<=str.length();len++){
        //     for(int start=0;start<=str.length()-len;start++){
        //         int end=start+len-1;
        //         System.out.println(str.substring(start,end+1));
        //     }
        // }
    }
    public static void main(String[] args) {
        String str=takeInput();
        printSubstring(str);
    }
}
