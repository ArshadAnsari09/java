package assignment.Array;

public class ArrayIntersection {
    public static void check(int arr1[],int arr2[]){
        for(int i=0;i<arr1.length;i++){
            int j;
            for(j=0;j<arr2.length;j++){
                 if(arr1[i]==arr2[j]){
                     System.out.println(arr1[i]);
                 }
            }
        }
    }
    public static void main(String[] args) {
        int arr1[]={2,1,3,5,78};
        int arr2[]={4,6,1,2,3};
        check(arr1,arr2);
    }
}
