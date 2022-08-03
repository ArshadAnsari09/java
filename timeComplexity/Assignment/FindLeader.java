package timeComplexity.Assignment;
import java.util.Scanner;
public class FindLeader {
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
    public static void findLeader(int arr[]){
        for(int i=0;i<arr.length;i++){
            int j;
            for(j=i+1;j<arr.length;j++){
                if(arr[i]<=arr[j]){
                    break;
                }
            }
            if(j==arr.length){
             System.out.println(arr[i]);
            }
        }
        
    }
    
    public static void main(String[] args) {
        int arr[]=takeInput();
        findLeader(arr);
    }
}
