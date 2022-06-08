package assignment.Array;

public class SortArrayBy012 {
    public static void printArray(int arr[])
    {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
    public static void sort012(int arr[]){
        int nextZero=0;
        int nextTwo=arr.length-1;
        int i=0;
        while(i<=nextTwo){
            if(arr[i]==0){
                int temp=arr[nextZero];
                arr[nextZero]=arr[i];
                arr[i]=temp;
                i++;
                nextZero++;
            }else if(arr[i]==2){
                int temp=arr[nextTwo];
                arr[nextTwo]=arr[i];
                arr[i]=temp;
                nextTwo--;
            }
            else{
                i++;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={1,0,2,1,0,1,2,0};
        sort012(arr);
        printArray(arr);
    }
}
