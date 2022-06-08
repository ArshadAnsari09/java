package array;

import java.util.Scanner;

public class Swaping {

    public static int[] takeInput(){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
       
       for(int i=0;i<n;i++){
        System.out.println("Enter the array's element at "+i+" th index");
        arr[i]=s.nextInt();
       }
        return arr;
    }
    public static void update(int arr[]){

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    public static void swapAlternate(int[] arr) {
        for (int i = 0; i < (arr.length - 1); i += 2) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
            
        }
        
       
    }

    public static void main(String[] args) {
     int arr[]=takeInput();
     swapAlternate(arr);
     update(arr);
    }
}
