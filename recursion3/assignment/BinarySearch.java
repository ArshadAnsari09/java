package recursion3.assignment;
import java.util.Scanner;
public class BinarySearch {
    private static int binarySearchHelper(int arr[],int start,int end,int x){
       if(start>end){
           return -1;
       }
       int mid=(start+end)/2;
       if(arr[mid]==x){
           return mid;
       }
       else if(arr[mid]>x){
           return binarySearchHelper(arr,start, mid-1, x);
       }else{
        return binarySearchHelper(arr,mid+1, end, x);
       }
    }
    public static int binarySearch(int arr[],int x){
        return binarySearchHelper(arr,0,arr.length-1, x);
    }
    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       int arr[]={1,3,4,5,7,10};
       int x=s.nextInt();
       int ans=binarySearch(arr,x);
       System.out.println(ans);
    }
}
