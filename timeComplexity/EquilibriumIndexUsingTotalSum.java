package timeComplexity;
import java.util.Scanner;
public class EquilibriumIndexUsingTotalSum {
    public static int[] takeInput(){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            System.out.println("element at "+i+" th index");
            arr[i]=s.nextInt();
        }
        return arr;
    }
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static int findEquilibriumIndex(int arr[]){
        int totalSum=0,leftSum=0;
        for(int i=0;i<arr.length;i++){
            totalSum+=arr[i];
        }
        for(int i=0;i<arr.length;i++){
           int rightSum=totalSum-leftSum- arr[i];
            if(leftSum==rightSum){
                return i;
            }
            leftSum+=arr[i];
        }
       return -1;
    }
    public static void main(String[] args) {
        int arr[]=takeInput();
        printArray(arr);
        int ans=findEquilibriumIndex(arr);
        System.out.println(ans);
    }
}
