package recursion3.assignment;

public class PrintPermutation {
    private static void printAllPermutation(String input, String ans){
        if(input.length()==0){
            System.out.println(ans);
            return;
        }

        for(int i=0;i<input.length();i++){
            char ch=input.charAt(i);
            String ros=input.substring(0,i)+input.substring(i+1);
            printAllPermutation(ros,ans+ch);
        }
    }
    public static void printAllPermutation(String input){
        printAllPermutation(input,"");
    }
    public static void main(String[] args) {
        String str="agi";
        printAllPermutation(str);
    }
}
