package timeComplexity.Assignment;
import java.util.Scanner;
import java.util.Arrays;
public class Duplicate {
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
    public static void duplicateElement(int arr[]){
        Arrays.sort(arr);
        
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                System.out.println(arr[i]);
            }
        }
        
    }
    public static void main(String[] args) {
        int arr[]=takeInput();
        duplicateElement(arr);
 
    }
}
