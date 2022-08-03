package timeComplexity.Assignment;
import java.util.Scanner;
public class DuplicateElementBySum {
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
    public static int duplicateElement(int arr[]){
        int sum1=0;     //sum of all no. between 0 to n-2
        for(int i=0;i<arr.length-1;i++){
          sum1+=i;
        }
        int sum2=0;     //sum of all given arrays element
        for(int i=0;i<arr.length;i++){
            sum2+=arr[i];
        }
        return (sum2-sum1);
    }
    public static void main(String[] args) {
        int arr[]=takeInput();
        int ans=duplicateElement(arr);
        System.out.println(ans);
    }
}
