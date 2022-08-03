package timeComplexity.Assignment;
import java.util.Scanner;
public class UniqueElementUsingXOR {
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
        int XOR=0;
        
        for(int i=0;i<arr.length;i++){
            XOR^=arr[i];
        }
      return XOR;
    }
    public static void main(String[] args) {
        int arr[]=takeInput();
        int ans=uniqueElement(arr);
        System.out.println(ans);
    }
}

