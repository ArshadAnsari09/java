package recursion3.assignment;

public class ReturnPermutation {
    public static String[] getPermutation(String input) {
        if(input.length() == 0){
            String output[]={" "};
            return output;
        }

        String smallOutput[]=getPermutation(input.substring(1));
        
        String output[]=new String[input.length()*smallOutput.length];

        int k=0;
        for(int i=0;i<smallOutput.length;i++){
            String currenString=smallOutput[i];
            for(int j=0;j<currenString.length();j++){
                output[k]=currenString.substring(0,j)+input.charAt(0)+currenString.substring(j);
                k++;
            }
        }
        
return output;
        
    }
    public static void main(String[] args) {
        String str="abc";
        String output[]=getPermutation(str);
        for(String i:output){
            System.out.print(i+" ");
            System.out.println();
        }
    }
}
