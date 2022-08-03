package timeComplexity.Assignment;
import java.util.Scanner;
import java.util.Arrays;
public class TripletSum {
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
    public static int tripletSum(int arr[],int num){
        Arrays.sort(arr);
        int n=arr.length;
        int numTriplets=0;
        for(int i=0;i<n;i++){
            int pairSumFor=num-arr[i];
            int numPairs=pairSum(arr,(i+1),(n-1),pairSumFor);
            numTriplets+=numPairs;
        }
        return numTriplets;
    }
    public static int pairSum(int arr[],int startIndex,int endIndex,int num){
        int numPair=0;
        while(startIndex<endIndex){
            if(arr[startIndex]+arr[endIndex]<num){
                startIndex++;
            }else   if(arr[startIndex]+arr[endIndex]>num){
                endIndex--;
            }else{
                int elementAtStart=arr[startIndex];
                int elementAtEnd=arr[endIndex];
                if(elementAtStart==elementAtEnd){
                    int totalElementsFromStartToEnd=(endIndex-startIndex)+1;
                    numPair+=(totalElementsFromStartToEnd*(totalElementsFromStartToEnd-1)/2);
                    return numPair;
                }
                int tempStartIndex=startIndex+1;
                int tempEndIndex=endIndex-1;
                while(tempStartIndex<=tempEndIndex && arr[tempStartIndex]==elementAtStart){
                    tempStartIndex++;
                }
                while(tempEndIndex>=tempStartIndex && arr[tempEndIndex]==elementAtEnd){
                    tempEndIndex--;
                }
                int totalElementsFromStart=(tempStartIndex-startIndex);
                int totalElementsFromEnd=(endIndex-tempEndIndex);
                numPair+=(totalElementsFromStart*totalElementsFromEnd);
                startIndex=tempStartIndex;
                endIndex=tempEndIndex;
            }
        }
        return numPair;
    }
    public static void main(String[] args) {
        int arr[]=takeInput();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the value of num");
        int num=s.nextInt();
        int ans=tripletSum(arr,num);
        System.out.println(ans);
    }
}
