package arrays2d;
import java.util.Scanner;
public class RowWiseSum {
    public static int[][] takeInput(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the No of rows");
        int rows=s.nextInt();
        System.out.println("Enter the No of cols");
        int cols=s.nextInt();
        int arr[][]=new int[rows][cols];

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.println("Enter the element at "+i+" row "+j+" cols");
                arr[i][j]=s.nextInt();
            }
        }
        return arr;

    }
    public static void rowWiseSum(int arr[][]) {
        int rows=arr.length;
        int cols=arr[0].length;
        int rowSum=0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
               rowSum+=arr[i][j];
               if(j==cols-1){
                System.out.print(rowSum+" ");
                rowSum=0;
               }
            }
            
        }
        
    }
    public static void main(String[] args) {
        int input[][]=takeInput();
        rowWiseSum(input);
    }
}
