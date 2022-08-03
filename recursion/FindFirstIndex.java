package recursion;

public class FindFirstIndex {
    private static int findIndex(int arr[],int startIndex,int x){
        if(startIndex==arr.length){
            return -1;
        }
        if(arr[startIndex]==x){
            return startIndex;
        }
        return findIndex(arr,startIndex+1,x);
    }
    public static int findIndex(int arr[]){
        int x=0;
        return findIndex(arr,0,x);
    } 
    public static void main(String[] args) {
        int arr[]={2,5,6,4,3};
        int ans=findIndex(arr);
        System.out.println(ans);
    }
}
