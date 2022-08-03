package timeComplexity.Assignment;
import java.util.Scanner;
public class FindMinimumLengthWord {
    public static void minimumLength(String str){
        int count=0;
        int minLength=-1;
        int c=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=' '){
                if(str.charAt(i)>='a' && str.charAt(i)<='z'){
                    c++;
                }
            }
            if(c>=minLength){
                count++;
                c=0;
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine(); 
        minimumLength(str);
        
    }
}
