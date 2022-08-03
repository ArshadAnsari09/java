package timeComplexity;
import java.util.Scanner;
public class EquilibriumTimeCmpl {
    public static int[] takeInput(){
        Scanner s=new Scanner(System.in);
        System.out.println("Length of an array");
        int n=s.nextInt();
        int input[]=new int[n];
        for(int i=0;i<input.length;i++){
            System.out.println("Enter the element at "+i+" th index");
            input[i]=s.nextInt();
        }
        return input;
        }
        public static void printArray(int input[]){
            for(int i=0;i<input.length;i++){
                System.out.println(input[i]);
            }
            System.out.println( );
        }
        public static int findIndex(int arr[]){
           int rightsum=0,leftsum=0;
           for(int i=0;i<arr.length;i++){
               rightsum+=arr[i];
           }
           for(int i=0;i<arr.length;i++){
            rightsum-=arr[i];
     
        if(leftsum == rightsum){
            return i;
        }
        leftsum+=arr[i];
        }
     
            /* return -1 if no equilibrium index is found */
            return -1;
        }
        public static void main(String[] args) {
            int arr[]=takeInput();
            printArray(arr);
            int ans=findIndex(arr);
            System.out.println(ans);
           }
}
