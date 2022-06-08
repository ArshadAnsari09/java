package strings;
import java.util.Scanner;
public class CountWord {
    public static int count(String str){
        int space=0;
        if(str.length()==0){
          return 0;
        }
        for(int i=0;i<str.length();++i){
            if(str.charAt(i)==' '){
                ++space;
            }
        }
        return space+1;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        int words=count(str);
        System.out.println(words);
    }
}
