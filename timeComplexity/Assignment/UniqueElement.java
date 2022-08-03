package timeComplexity.Assignment;
import java.util.Scanner;
import java.util.Arrays;
public class UniqueElement {
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
    public static int uniqueElement(int arr[]){
        Arrays.sort(arr);
        
        for(int i=0;i<arr.length;i+=2){
            if(arr[i]!=arr[i+1]){
                return arr[i];
            }
        }
      return Integer.MAX_VALUE;
    }
    public static void main(String[] args) {
        int arr[]=takeInput();
        int ans=uniqueElement(arr);
        System.out.println(ans);
    }
}
