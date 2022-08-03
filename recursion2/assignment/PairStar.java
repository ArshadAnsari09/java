package recursion2.assignment;

public class PairStar {
    public static String pairStar(String str){
        if(str.length()<=1){
            return str;
        }
        String ans="";
       if(str.charAt(0)==str.charAt(1)){
           ans=ans+str.charAt(0)+"*";
       }else{
           ans=ans+str.charAt(0);
       }
       String smallAns=pairStar(str.substring(1));
       return ans+smallAns;
    }
    public static void main(String[] args) {
        String str="hhelloll";
        String ans=pairStar(str);
        System.out.println(ans);
    }
}
