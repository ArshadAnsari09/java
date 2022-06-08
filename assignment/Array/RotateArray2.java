package assignment.Array;
import java.util.Scanner;
public class RotateArray2 {
    public static void rotateArray(int arr[],int d){
      for(int i=d;i<arr.length;i++){
          arr[i]=arr[i+d];
      }
    }
    public static void printArray(int arr[])
    {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int d=s.nextInt();
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        rotateArray(arr, d);
        printArray(arr);
    }
}
