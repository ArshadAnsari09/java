package assignment.Array;

public class Sort0And1 {
    public static void sortZeroesAndOnes(int arr[]){
        int nextZero=0;
        int i;
        for( i=0;i<arr.length;i++){
            if(arr[i]==0){
                int temp=arr[nextZero];
                arr[nextZero]=arr[i];
                arr[i]=temp;
                nextZero+=1;
            }
            
        }
 
    }
    public static void update(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[]={0,1,0,1,0,1,1,0};
        sortZeroesAndOnes(arr);
        update(arr);
    }
}
