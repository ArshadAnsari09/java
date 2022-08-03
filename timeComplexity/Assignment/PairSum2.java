package timeComplexity.Assignment;
import java.util.Scanner;
import java.util.Arrays;
public class PairSum2 {
    public static int[] takeInput(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n=s.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter an arrays elements");
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        return arr;
    }
    public static void pairSum(int arr[],int num){
        Arrays.sort(arr);
        int i=0;
        int j=arr.length-1;
        int count=0;
        int x=j;
        while(i<x){
            if(arr[i]+arr[j]<num){
                i++;
            }else if(arr[i]+arr[j]>num){
                j--;
            }else{
                System.out.println("("+arr[i]+","+arr[j]+")");
                count++;
                x--;
                
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        int arr[]=takeInput();
        Scanner s=new Scanner(System.in);
        System.out.println("Sum to be find");
        int num=s.nextInt();
       pairSum(arr,num);
;
    }
}
