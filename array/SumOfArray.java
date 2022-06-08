package array;
import java.util.Scanner;
public class SumOfArray {
    public static void printArray(int[] arr){
        // Scanner s=new Scanner(System.in);
        // int c=s.nextInt();
     System.out.println();
     System.out.println("Your array is ");
    
     for(int i=0; i<arr.length; i++){
         System.out.println(arr[i]);
     }
   
    
    }
    public static int[] takeInput(){
        Scanner s=new Scanner(System.in);
        // int c=s.nextInt();
        int n=s.nextInt();
        int[] arr=new int[n];
        
        for(int i=0;i<n;i++){
            System.out.println("Enter element at "+i+" the index");
            arr[i]=s.nextInt();
        }
    
        return arr;

    }
    public static int sum(int[] arr){
        // Scanner s=new Scanner(System.in);
        // int c=s.nextInt();
        int ans=0;
       
        for(int i=0;i<arr.length;i++){
            ans+=arr[i];
        }
    
      return ans;
    }

   public static void main(String[] args) {
       int[] arr= takeInput();
       printArray(arr);
       int add=sum(arr);
       System.out.println(add);
   } 
}
