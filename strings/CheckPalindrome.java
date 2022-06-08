package strings;

public class CheckPalindrome {
    // public static String reverseString(String str){
    //     String reverseStr="";
    //     for(int i=str.length()-1;i>=0;i--){
    //         reverseStr+=str.charAt(i);
    //     }
    //     return reverseStr;
    // }
    // public static void palindrome(String str,String reverseStr){
    //     if(str.equals(reverseStr)){
    //        System.out.println("It is Palindrome");
    //     }
    //     else{
    //         System.out.println("It is not a Palindrome");
    //     }

    // }

    
    public static String palindrome(String str){
       int i=0,j=str.length()-1;
       
       while(i<j){
           if(str.charAt(i)!=str.charAt(j)){
               return "false";
           }
           else{
               i++;
               j--;
           }
       }
       return "true";
  
    }
    // public static void main(String[] args) {
    //     String str="aa";
    //     String reverseStr=reverseString(str);
    //     System.out.println(reverseStr);
    //     palindrome(str,reverseStr);

    // }
    public static void main(String[] args) {
        String str="aabdaa";
        String check=palindrome(str);
        System.out.println(check);
    }
}
