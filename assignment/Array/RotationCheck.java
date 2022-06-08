package assignment.Array;

public class RotationCheck {
    public static int rotationCheck(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                return i+1; //return index
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int arr[]={5,6,1,2,3,4};
        int ans=rotationCheck(arr);
        System.out.println(ans);
    }
}
