package strings;

public class ReverseString {
    public static String reverseString(String str){
        String reverseString="";
        // for(int i=str.length()-1;i>=0;i--){
        //     reverseString+=str.charAt(i);
        // }
         for(int i=0;i<str.length();i++){
            reverseString=str.charAt(i)+reverseString;
        }
        return reverseString;
    }
    public static void main(String[] args) {
        String str="pqrstu";
        String reverse=reverseString(str);
        System.out.println(reverse);
    }
}
