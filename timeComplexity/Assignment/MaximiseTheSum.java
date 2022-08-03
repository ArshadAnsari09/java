package timeComplexity.Assignment;
import java.util.Scanner;
public class MaximiseTheSum {
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
    public static int maximiseSum(int arr1[],int arr2[]){
        int maxSum=0;
        int s1=0;    //sum_of_arr1
        int s2=0;    //sum_of_arr2
        int i=0;  //startIndexOfArr1
        int j=0;    //startIndexOfArr2
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                s1+=arr1[i];
                i++;
            }else if(arr1[i]>arr2[j]){
                s2+=arr2[j];
                j++;
            }else{
                maxSum+=Math.max(s1,s2)+arr1[i];
                s1=0;
                s2=0;
                i++;
                j++;
            }
        }
        while(i<arr1.length){
            s1+=arr1[i];
            i++;
        }
        while(j<arr2.length){
            s2+=arr2[j];
            j++;
        }
       maxSum+=Math.max(s1,s2);
        return maxSum;
    }
    public static void main(String[] args) {
        int arr1[]=takeInput();
        int arr2[]=takeInput();
        int ans=maximiseSum(arr1,arr2);
        System.out.println(ans);
    }
}
