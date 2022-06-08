package array;
import java.util.Scanner;
public class ArrangingNumber {
    
    
   
    
    public static void arrange(int arr[], int n){
        int i=0;
        int j=n-1;
        int value=1;
        while(i<=j){
           if(value%2==1){
               arr[i]=value;
               value++;
               i++;
           }else{
               arr[j]=value;
               value++;
               j--;
           }
        }  
    }
 public static void main(String[] args) {
     Scanner s=new Scanner(System.in);
     int n=s.nextInt();
     int arr[]=new int[n];
     arrange(arr,n);
     for(int i=0;i<n;i++){
         System.out.println(arr[i]);
     }
     
     
 } 


}
