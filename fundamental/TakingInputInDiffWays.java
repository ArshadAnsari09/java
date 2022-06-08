package fundamental;
import java.util.Scanner;

public class TakingInputInDiffWays {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        
        //taking input as word
        // String str=input.next();
        // System.out.println(str);

        //taking input as whole line
        // String str=input.nextLine();
        // System.out.println(str);

        //taking input as char
        String str=input.next();
        char ch=str.charAt(3);
        System.out.println(ch);
    }
}
