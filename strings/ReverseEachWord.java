package strings;

public class ReverseEachWord {
    public static String reverseEachWord(String str){
        String ans="";
        int currentWordStart=0;
        int i=0;
        for(;i<str.length();i++){
            if(str.charAt(i)==' '){
                 //reverse current word
                 String reversedWord="";
                 int currentWordEnd=i-1;
                 for(int j=currentWordStart;j<=currentWordEnd;j++){
                          reversedWord=str.charAt(j)+reversedWord;
                 }
                 //add to String
                 ans+=reversedWord+" ";
                 currentWordStart=i+1;
            }
        }
        String reversedWord="";
        int currentWordEnd=i-1;
        for(int j=currentWordStart;j<=currentWordEnd;j++){
                 reversedWord=str.charAt(j)+reversedWord;
        }
        //add to String
        ans+=reversedWord;
        return ans;
    }
    public static void main(String[] args) {
        String str="abc def ghi";
        String result=reverseEachWord(str);
        System.out.println(result);
    }
}
