package array;

public class PrintAllPairs {
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                System.out.println("("+arr[i]+","+arr[j]+")");
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={1,4,7,5,8};
        printArray(arr);
    }
}
