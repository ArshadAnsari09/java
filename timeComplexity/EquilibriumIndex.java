package timeComplexity;
import java.util.Scanner;
public class EquilibriumIndex {
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
            int i, j;
            int leftsum, rightsum;
            int n=arr.length;
            /* Check for indexes one by one until
               an equilibrium index is found */
            for (i = 0; i < n; ++i) {
     
                /* get left sum */
                leftsum=0;
                for (j = 0; j < i; j++){
                    leftsum += arr[j];
                }
                /* get right sum */
                rightsum=0;
                for (j = i + 1; j < n; j++){
                    rightsum += arr[j];
                }
                /* if leftsum and rightsum are same,
                   then we are done */
                if (leftsum == rightsum){
                    return i;
                }
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
