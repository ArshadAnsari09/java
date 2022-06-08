package assignment.Array;

public class SecondLargest {
    public static int secondLargestElement(int arr[]){
        if(arr.length==0){
            return Integer.MIN_VALUE;
        }
        int largest=arr[0];
        int secondLargest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
          if(largest<arr[i]){
              secondLargest=largest;
              largest=arr[i];
          }
          else if(secondLargest<arr[i] && arr[i]!=largest){
              secondLargest=arr[i];
          }
        }
        return secondLargest;
    }
    public static void main(String[] args) {
        int arr[]={2,6,1,9,8,9,7};
        int ans=secondLargestElement(arr);
          System.out.println(ans);

    }
}
