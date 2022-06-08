package assignment.Array;
import java.util.Scanner;
public class TripletSum {
    public static int[] takeInput(){
        System.out.println("array's length");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter element at "+i+" th index");
            arr[i]=s.nextInt();
        }
        return arr;
    }
    public static int tripletSum(int arr[],int x){
        int count=0;
        for(int i=0;i<arr.length;i++){
            int j;int k;
            for(j=i+1;j<arr.length;j++){
                for(k=j+1;k<arr.length;k++){
                    if(arr[i]+arr[j]+arr[k]==x){
                        count++;
                    }
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[]=takeInput();
        System.out.println("Number to be check");
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        int ans=tripletSum(arr,x);
        System.out.println(ans);

    }
}
