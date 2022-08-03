package recursion2;

public class QuickSort {
    public static void quickSort(int input[],int si,int ei){
        if(si>=ei){
            return;
        }
        int pivotPos=partition(input,si,ei);
        quickSort(input,si,pivotPos-1);
        quickSort(input,pivotPos+1,ei);

    }

    public static int partition(int input[],int si,int ei) {
        int pivot=input[si];
        int count=0;
        for(int i=si+1;i<=ei;i++){
            if(input[i]<=pivot){
                count++;
            }
        }
        
        //find pivot
        int pivotPos=si+count;

        //swap Pivot
        input[si]=input[pivotPos];
        input[pivotPos]=pivot;
        
        int i=si;
        int j=ei;

        //ensuring L.H.S <input[pivotPos] and R.H.S >input[pivotPos]
        while(i<pivotPos && j>pivotPos){
            if(input[i]<=pivot){
                i++;
            }else if(input[j]>pivot){
                    j--;
            }else{
                    int temp=input[i];
                    input[i]=input[j];
                    input[j]=temp;
                    i++;
                    j--;
                }
            }
            return pivotPos;
        }


    public static void main(String[] args) {
        int arr[]={4,8,10,18,19,9,2,6,11,5};
        quickSort(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
