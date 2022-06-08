package array;
import java.util.Scanner;
public class FindinIndexOfX {
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
    public static void printArray(int arr[]){
        for(int i=0 ; i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static int linearSearch(int arr[],int valueToFind){
        for(int i=0 ; i<arr.length;i++){
            if(arr[i]==valueToFind){
                 return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]=takeInput();
        printArray(arr);
        System.out.println();
        System.out.println("Enter value to be find");
        Scanner s=new Scanner(System.in);
        int valueToFind=s.nextInt();
        int search=linearSearch(arr,valueToFind);
        System.out.println(search);
    }
}
