package assignment.String;
import java.util.Scanner;
public class RemoveConsecutiveDuplicate {
    public static String takeInput(){
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        return str;
    }
    public static String removeConsecutiveDuplicate(String str){
      int n=str.length();
      if(n==0){
          return str;
      }
      String ans="";
      int i=0;
      while(i<n){
          char uniqueChar=str.charAt(i);
          int j=i+1;
          while(j<n && str.charAt(j)==uniqueChar){
              j++;
          }
          ans+=uniqueChar;
          i=j;
      }
      return ans;
    }
    public static void main(String[] args) {
        String str=takeInput();
       String ans= removeConsecutiveDuplicate(str);
       System.out.println(ans );

    }
}
