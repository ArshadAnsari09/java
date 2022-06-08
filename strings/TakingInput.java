package strings;
import java.util.Scanner;
public class TakingInput {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.next();
        System.out.println(str+" "+str.length());
        String str3=s.next();
        System.out.println(str3+ " "+str3.length());
        String str2=s.nextLine();
        System.out.println(str2+" "+str2.length());
        // int i=s.nextInt();
        // System.out.println(i);
        // String str4=s.nextLine();
        // System.out.println(str4+" "+str4.length());
        
    }
}
