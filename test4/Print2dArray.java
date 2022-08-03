package test4;

public class Print2dArray {
    public static void print2dArray(int input[][]){
      for(int i=0;i<input.length;i++){
        for(int k=0;k<input.length-i;k++){
            for(int j=0;j<input[i].length;j++){
            System.out.print(input[i][j]+" ");
            }
        }
      }
        
    }

    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        print2dArray(arr);
    }
}
