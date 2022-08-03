package timeComplexity;
import java.util.Scanner;
import java.util.Arrays;
public class ArrayIntersectionIUsingSort {
    public static int[] takeInput(){
        Scanner s=new Scanner(System.in);
        System.out.println("Length of an array");
        int n=s.nextInt();
        int input[]=new int[n];
        for(int i=0;i<input.length;i++){
            System.out.println("Enter the element at "+i+" th index");
            input[i]=s.nextInt();
        }
        return input;
        }
        public static void printArray(int input[]){
            for(int i=0;i<input.length;i++){
                System.out.println(input[i]);
            }
        }
        public static void arrayIntersection(int input1[],int input2[]){
            Arrays.sort(input1);
            Arrays.sort(input2);
            int n=input1.length;
            int m=input2.length;
            int i=0,j=0;
            while(i<n && j<m){
                if(input1[i]==input2[j]){
                    System.out.println(input1[i]);
                    i++;
                    j++;
                }else if(input1[i]<input2[j]){
                    i++;
                }else{
                    j++;
                }
            }

        }
        public static void main(String[] args) {
            int arr1[]=takeInput();
            printArray(arr1);
            int arr2[]=takeInput();
            printArray(arr2);
            arrayIntersection(arr1,arr2);
        }
    }

