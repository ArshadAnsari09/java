package recursion;

public class LastIndex_2 {
    private static int findLastIndex(int arr[],int n,int x){
        
        if(n==0){
            return -1;
        }
        if(arr[n-1]==x){
            return n-1;
        }
        return findLastIndex(arr, n-1, x);
      

    }
    public static int findIndex(int arr[],int x){
        return findLastIndex(arr,arr.length,x);
    } 
    public static void main(String[] args) {
        int arr[]={6,5,6,10,3};
        int x=6;
        int ans=findIndex(arr,x);
        System.out.println(ans);
    }
}
