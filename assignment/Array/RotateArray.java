package assignment.Array;
import java.util.Scanner;
public class RotateArray {
    public static void rotateArray(int arr[],int d)
    {for (int r = 0; r < d; r++){
        int i, temp;
        temp = arr[0];
        for (i = 0; i < arr.length - 1; i++){
            arr[i] = arr[i + 1];
        }
        arr[arr.length-1] = temp;
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
