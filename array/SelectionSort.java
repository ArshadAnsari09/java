package array;
import java.util.Scanner;
public class SelectionSort {
    public static int[] takeInput(){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
       
       for(int i=0;i<n;i++){
        System.out.println("Enter the array's element at "+i+" th index");
        arr[i]=s.nextInt();
       }
        return arr;
    }
    public static void update(int arr[]){

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void selectionSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int min=Integer.MAX_VALUE;
            int minIndex=-1;
            for(int j=i;j<arr.length;j++){
                if(arr[j]<min){
                    min=arr[j];
                    minIndex=j;
                }
            }
            int temp=arr[minIndex];
            arr[minIndex]=arr[i];
            arr[i]=temp;
        }
    }
   public static void main(String[] args) {
       int arr[]=takeInput();
       selectionSort(arr);
       update(arr);
   } 
}
