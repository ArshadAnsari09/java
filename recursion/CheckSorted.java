package recursion;

public class CheckSorted {
    public static boolean checkSorted(int arr[],int startIndex){
        if(startIndex>=arr.length-1){
            return true;
        }
        if(arr[startIndex]>arr[startIndex+1]){
            return false;
        }
        boolean smallAns=checkSorted(arr,startIndex+1);
        return smallAns;
    }
    public static void main(String[] args) {
        int arr[]={1,3,4,5,2};
        int startIndex=0;
        boolean ans=checkSorted(arr,startIndex);
        System.out.println(ans);
    }
}
