package assignment.Array;

public class FindUnique {
    public static int findUnique(int input[]){
        for(int i=0;i<input.length;i++){
           int j;
           for(j=0;j<input.length;j++){
               if(i!=j){
                   if(input[i]==input[j]){
                     break;
                   }
               }
           } 
           if(j==input.length){
               return input[i];
           }
        }
        return Integer.MAX_VALUE;
    }
   public static void main(String[] args) {
       int arr[]={3,5,5,2,7,7,3};
       
       int result=findUnique(arr);
       System.out.println(result);
   } 
}
