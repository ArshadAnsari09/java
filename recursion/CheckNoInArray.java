package recursion;

public class CheckNoInArray {
    public static boolean checkArrayElement(int arr[],int x,int i){
         if(i==arr.length){
             return false;
         }
         if(arr[i]==x){
           return true;
         }
         return checkArrayElement(arr, x, i+1);
    }
 public static void main(String[] args) {
    int arr[]={2,5,6,7};
    int x=7;
    int startIndex=0;
    boolean ans=checkArrayElement(arr,x,startIndex);
    System.out.println(ans);
 }
}
