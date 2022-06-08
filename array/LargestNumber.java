package array;
import java.util.Scanner;
public class LargestNumber {
    public static int largestNumber(int arr[]){
        int max=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                
                max=arr[i];
            }
        }System.out.println("Largest number=");
        return max;
    }
    public static int[] takeInput(){
     Scanner s=new Scanner(System.in);
     int n=s.nextInt();
     int arr[]=new int[n];
     for(int i=0; i<n;i++){
         System.out.println("Enter the array's element at "+i+" th index");
         arr[i]=s.nextInt();
     }
     return arr;
    }

    public static void main(String[] args) {
        int arr[]=takeInput();
        int max=largestNumber(arr);
        System.out.println(max);
    }
}
