package recursion3.assignment;

public class PrintSubsetsSumEqualsToK {
    public static void printSubsetSumTokHelper(int input[],int startIndex,int output[],int k) {
        if(startIndex==input.length){
         if(k==0){
             for(int i:output){
                 System.out.print(i+" ");
             }
             System.out.println();
             return;
         }else{
             return;
         }
        }

        int newOutput[]=new int[output.length+1];
        int i=0;
        for(;i<output.length;i++){
            newOutput[i]=output[i];
        }
        newOutput[i]=input[startIndex];
        printSubsetSumTokHelper(input, startIndex+1, output, k);
        printSubsetSumTokHelper(input, startIndex+1, newOutput, k-input[startIndex]);
    }
    public static void printSubsetSumTok(int input[],int k) {
        int output[]=new int[0];
        printSubsetSumTokHelper(input,0,output, k);
    }
   public static void main(String[] args) {
       int arr[]={5,1,2,6,7,4,3};
       int k=9;
       printSubsetSumTok(arr,k);
   } 
}
