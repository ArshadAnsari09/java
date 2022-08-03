package recursion3.assignment;

public class PrintSubsetOfArray {
    public static void printSubsetOfArrayHelper(int input[],int startIndex,int output[]) {
        if(startIndex==input.length){
            for(int i:output){
                System.out.print(i+" ");

            }
            System.out.println();
            return;
        }

        int newOutput[]=new int[output.length+1];
        int i=0;
        for(;i<output.length;i++){
            newOutput[i]=output[i];
        }
        newOutput[i]=input[startIndex];
        printSubsetOfArrayHelper(input, startIndex+1, output);
        printSubsetOfArrayHelper(input, startIndex+1, newOutput);
    }
    public static void printSubsetOfArray(int input[]){
        int output[]=new int[0];
        printSubsetOfArrayHelper(input,0,output);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3};
        printSubsetOfArray(arr);

    }
}
