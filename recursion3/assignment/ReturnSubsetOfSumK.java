package recursion3.assignment;

public class ReturnSubsetOfSumK {

    public static int[][] subsetOfSumEqualsKHelper(int input[],int startIndex,int k){
         if(startIndex==input.length){
             if(k==0){
                 return new int[1][0];
             }else{
                 return new int[0][0];
             }
         }
         int smallOutput1[][]=subsetOfSumEqualsKHelper(input, startIndex+1, k);
         int smallOutput2[][]=subsetOfSumEqualsKHelper(input, startIndex+1, k-input[startIndex]);

         int output[][]=new int[smallOutput1.length+smallOutput2.length][];

         int index=0;
         for(int i=0;i<smallOutput1.length;i++){
             output[index++]=smallOutput1[i];
         }

         for(int i=0;i<smallOutput2.length;i++){
             output[index]=new int[smallOutput2[i].length+1];
             output[index][0]=input[startIndex];
             for(int j=0;j<smallOutput2[i].length;j++){
                 output[index][j+1]=smallOutput2[i][j];
             }
             index++;
         }
         return output;
    }
    public static int[][] subsetOfSumEqualsK(int input[],int k) {
        return subsetOfSumEqualsKHelper(input,0,k);
    }
    public static void main(String[] args) {
        int arr[]={1,2,2,6,5,7,8};
        int k=7;
        int[][] ans=subsetOfSumEqualsK(arr,k);
  
        for(int i=0;i<ans.length;i++){
            for(int j=0;j<ans[i].length;j++)
            {
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
        
    }
}
