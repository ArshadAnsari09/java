package recursion2;
import java.util.Scanner;
public class MergeSort {
    public static int[] takeInput(){
        Scanner s=new Scanner(System.in);
        System.out.println("Size of an Array");
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
          arr[i]=s.nextInt();
        }
        return arr;
    }

    public static void mergeSort(int input[]){
        if(input.length<=1){
            return;
        }

        int mid=input.length/2;
        int part1[]=new int[mid];
        int part2[]=new int[input.length-mid];

        for(int i=0;i<mid;i++){
            part1[i]=input[i];
        }
        int k=0;
        for(int i=mid;i<input.length;i++){
            part2[k]=input[i];
            k++;
        }

        mergeSort(part1);
        mergeSort(part2);
        merge(part1,part2,input);
    }

    public static void merge(int input1[],int input2[],int output[]){
        int i=0,j=0,k=0;
        while(i<input1.length && j<input2.length){
            if(input1[i]<input2[j]){
                output[k]=input1[i];
                k++;
                i++;
            }else{
                output[k]=input2[j];
                k++;
                j++;
            }
        }

        while(i<input1.length){
            output[k]=input1[i];
            k++;
            i++;
        }

        while(j<input2.length){
            output[k]=input2[j];
            k++;
            j++;
        }
    }

    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[]=takeInput();
        mergeSort(arr);
        printArray(arr);
    }
}
