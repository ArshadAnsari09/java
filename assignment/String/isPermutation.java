package assignment.String;
import java.util.Scanner;
public class isPermutation {
    public static String takeInput1(){
      Scanner s=new Scanner(System.in);
      String str1=s.nextLine();
      return str1;
    }
    public static String takeInput2(){
        Scanner s=new Scanner(System.in);
        String str2=s.nextLine();
        return str2;
      }
      public static boolean isPermutation(String str1,String str2){
          if(str1.length()!=str2.length()){
              return false;
          }
          int frequency[]=new int[256];
          for(int i=0;i<256;i++){
              frequency[i]=0;
          }
          for(int i=0;i<str1.length();i++){
              char ch=str1.charAt(i);
            ++frequency[ch];
        }
        for(int j=0;j<str1.length();j++){
            char ch=str1.charAt(j);
          --frequency[ch];
      }
      for(int i=0;i<256;i++){
          if(frequency[i]!=0){
              return false;
          }
        }
        return true;
      }
    public static void main(String[] args) {
        String str1=takeInput1();
        String str2=takeInput2();
        boolean ans=isPermutation(str1,str2);
        System.out.println(ans);
    }
}
