package timeComplexity.Assignment;
import java.util.Scanner;
import java.util.Arrays;
public class PairSum {
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
    public static int pairSum(int arr[],int num){
        Arrays.sort(arr);
        int i=0;
        int j=arr.length-1;
        int numPair=0;
        while(i<j){
            if(arr[i]+arr[j]<num){
                i++;
            }else if(arr[i]+arr[j]>num){
                j--;
            }
            else{
                int elementAtStart=arr[i];
                int elementAtEnd=arr[j];
                
                if(elementAtStart==elementAtEnd){
                    int totalElementsFromStartToEnd=(j-i)+1;
                numPair+=(totalElementsFromStartToEnd*(totalElementsFromStartToEnd-1)/2);
                return numPair;
                }
                int tempStartIndex=i+1;
                int tempEndIndex=j-1;
                while(tempStartIndex <= tempEndIndex && arr[tempStartIndex]==elementAtStart){
                    tempStartIndex++;
                }
                while(tempEndIndex >= tempStartIndex && arr[tempEndIndex]==elementAtEnd){
                    tempEndIndex--;
                }
                int totalElementsFromStart=tempStartIndex-i;
                int totalElementsFromEnd=j-tempEndIndex;
                numPair+=(totalElementsFromStart*totalElementsFromEnd);
                i=tempStartIndex;
                j=tempEndIndex;
            }

        }
        return numPair;
    }
    public static void main(String[] args) {
        int arr[]=takeInput();
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        int ans=pairSum(arr,num);
        System.out.println(ans);
    }
}
