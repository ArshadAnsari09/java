package timeComplexity.Assignment;
import java.util.Scanner;
public class Rotate {
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
    public static void rotateArray(int arr[],int d){
        for(int i=0;i<d;i++){
            int j,temp;
            temp=arr[0];
            for( j=0;j<arr.length-1;j++){
               arr[j]=arr[j+1];
            }
            arr[arr.length-1]=temp;
        }
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
