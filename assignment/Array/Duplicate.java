package assignment.Array;
import java.util.Scanner;
public class Duplicate {
    public static int[] takeInput(){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter element at "+i+ " th index");
            arr[i]=s.nextInt();
        }
        return arr;

    }
    public static int duplicateNumber(int[] arr){
        for(int i=0;i<arr.length;i++){
            int j;
            for(j=0;j<arr.length;j++){
                    if(i!=j){
                    if(arr[i]==arr[j]){
                      return arr[i];
                    }
                }

            }
        }
        return Integer.MAX_VALUE;
    }
    public static void main(String[] args) {
        int arr[]=takeInput();
        int result=duplicateNumber(arr);
        System.out.println(result);
        
    }
}
