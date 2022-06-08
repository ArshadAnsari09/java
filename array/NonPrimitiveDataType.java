package array;

public class NonPrimitiveDataType {
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(i);
        }
    }
    public static void incrementArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            arr[i]=arr[i]+1;
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        incrementArray(arr);
        printArray(arr);
    }
}
