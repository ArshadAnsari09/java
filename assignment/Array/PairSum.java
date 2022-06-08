package assignment.Array;
import java.util.Scanner;
public class PairSum {
    public static int[] takeInput(){
        System.out.println("Number Of Elements");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter element at "+i+" th index");
            arr[i]=s.nextInt();

        }
        return arr;
    }
    public static void sumOfPair(int arr[],int x){
        int count=0;
        for(int i=0;i<arr.length;i++){
            int j;
            for(j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==x){
                    count++;
                    System.out.println("("+arr[i]+","+arr[j]+")"+"at index "+i+","+j+" respectively");
                    
                }
            }
           
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        int arr[]=takeInput();
        System.out.println("Sum to be find for pairs");
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        sumOfPair(arr,x);
    }
}
