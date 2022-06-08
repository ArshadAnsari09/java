package assignment.Array;

public class PushZerosToEnd {
    public static void pushZerosToEnd(int arr[]){
         int nonZero=0;
         for(int i=0;i<arr.length;i++){
             if(arr[i]!=0){
                 int temp=arr[i];
                 arr[i]=arr[nonZero];
                 arr[nonZero]=temp;
                 nonZero++;
             }
         }
    }
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[]={2,0,0,1,3,0,0};
        pushZerosToEnd(arr);
        printArray(arr);

    }
}
