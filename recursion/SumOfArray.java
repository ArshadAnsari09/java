package recursion;

public class SumOfArray {
    public static int sum(int arr[],int n){
        if(n==0){
            return 0;
        }
       int smallAns= sum(arr,n-1);
        return arr[n-1]+smallAns;
    }
    public static int sum_2(int arr[],int startIndex){
        if(startIndex==arr.length){
            return 0;
        }
       return arr[startIndex]+sum(arr,startIndex+1);
    }
    public static void main(String[] args) {
        int arr[]={4,3,1};
        // int n=arr.length;
        int startIndex=0;
        // int ans=sum(arr,n);
        int ans=sum_2(arr,startIndex);
        System.out.println(ans);
    }
}
