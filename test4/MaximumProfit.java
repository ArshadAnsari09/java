package test4;
import java.util.*;
public class MaximumProfit {

    public static int maxProfit(int input[]){
        int ans=Integer.MIN_VALUE;
        int price=0;
        Arrays.sort(input);
        
        for(int i=0;i<input.length;i++){
            int count=input.length-i;
            if(count*input[i] >= ans){
                price=input[i];
                ans=count*input[i];
            }
        }
        return price;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("No. Of Buyers");
        int n=s.nextInt();
        int arr[]=new int[n]; 

        for(int i=0;i<n;i++){
            System.out.println("Budgets Of buyer "+ (i+1)+" ");
            arr[i]=s.nextInt();
        }
        int out=maxProfit(arr);
        System.out.println(out);
    }
}
