package recursion2;

public class RemoveConsecutiveDuplicate {
    public static String removeConsecutiveDuplicate(String str){
        if(str.length()<=1){
            return str;
        }   
        if(str.charAt(0) == str.charAt(1)){
           return removeConsecutiveDuplicate(str.substring(1));
        }else{
        String smallAns=removeConsecutiveDuplicate(str.substring(1));
        return str.charAt(0)+smallAns;
        }
    }
    public static void main(String[] args) {
        String str="aabccba";
        String ans=removeConsecutiveDuplicate(str);
        System.out.println(ans);
    }
}
