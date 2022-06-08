package array;

public class InsertiionSort {
    public static void insertSort(int arr[]){
        int i;
        for(i=1;i<arr.length;i++){
        int j=i-1;
        int temp=arr[i];
        while(j>=0 && arr[j]>temp){
            arr[j+1]=arr[j];
            j--;
        }
        arr[j+1]=temp;
    }

    }
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[]={9,6,5,7,2,8,1,3};
        insertSort(arr);
        printArray(arr);
    }
}
