package timeComplexity.Assignment;
import java.util.Scanner;
public class FindLeaderInReverse {
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
    public static void findLeaderInReverse(int arr[]){
        int n=arr.length;
        int max_from_right=arr[n-1];
        System.out.println(max_from_right);

        for(int i=n-2;i>=0;i--){
            if(max_from_right<arr[i]){
                max_from_right=arr[i];
                System.out.println(max_from_right);
            }
        }
    }
    public static void main(String[] args) {
        int arr[]=takeInput();
        findLeaderInReverse(arr);
    }
}
