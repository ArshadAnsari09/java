package recursion;

public class LastIndex {
    private static int findLastIndex(int arr[],int startIndex,int x){
        
        if(startIndex==arr.length){
            return -1;
        }
        int smallAns=findLastIndex(arr,startIndex+1,x);
        if(smallAns!=-1){
            return smallAns;
        }
        if(arr[startIndex]==x){
            return startIndex;
        }
        else{
            return -1;
        }

    }
    public static int findIndex(int arr[],int x){
        return findLastIndex(arr,0,x);
    } 
    public static void main(String[] args) {
        int arr[]={10,5,6,10,3};
        int x=3;
        int ans=findIndex(arr,x);
        System.out.println(ans);
    }
}
