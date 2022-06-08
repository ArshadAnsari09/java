package array;
import java.util.Scanner;
public class BinarySearch {
    public static int binarySearch(int arr[],int n){
       int start=0;
       int end=arr.length-1;
       while(start<=end){
           int m=(start+end)/2;
           if(n<arr[m]){ //move left side of middle element
            end=m-1;
           }
           else if(n>arr[m]){ //move to right side of middle element
                start=m+1;
           }else{
               return m;
           }

       }
       return -1;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]={1,4,5,7,8,15,20};
        int search=binarySearch(arr,n);
        System.out.println(search);
    }
}
