package timeComplexity.Assignment;
import java.util.Scanner;
public class Rotate2 {
    public static int[] takeInput(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the length of an array");
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        return arr;
    }
    public static void swapElements(int arr[],int start,int end){
       
       int temp=arr[start];
       arr[start]=arr[end];
       arr[end]=temp;
    }
    public static void reverse(int arr[],int start,int end){
        while(start<end){
            swapElements(arr,start,end);
            start++;
            end--;
        }
    }
   public static void rotateArray(int arr[],int d){
       if(arr.length==0){
           return;
       }
       if(d>=arr.length && arr.length!=0){
           d%=arr.length;
       }
       reverse(arr,0,arr.length-1); //whole array
       reverse(arr,0,arr.length-d-1); // 0 to n-d
       reverse(arr,arr.length-d,arr.length-1);  // n-d to n
   }
   public static void printArray(int arr[]){
       for(int i=0;i<arr.length;i++){
       System.out.println(arr[i]);
       }
   }
  

    public static void main(String[] args) {
        int arr[]=takeInput();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the value of d");
        int d=s.nextInt();
        rotateArray(arr,d);
        printArray(arr);
    }
}
