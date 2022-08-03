package arrays2d;
import java.util.Scanner;
public class LargestRowOrColsSum {
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
    public static int largestColsOrRowSum(int arr[][]){
        int rows=arr.length;
        int cols=arr[0].length;
        int largestOfCols=Integer.MIN_VALUE;
        int largestOfRows=Integer.MIN_VALUE;
        int index=-1;
        for(int j=0;j<cols;j++){
            int colSum=0;
            for(int i=0;i<rows;i++){
                colSum=colSum+arr[i][j];
            }
            if(colSum>largestOfCols){
                largestOfCols=colSum;
                index=j;
            }
        }
        for(int i=0;i<rows;i++){
            int rowSum=0;
            for(int j=0;j<cols;j++){
                rowSum=rowSum+arr[i][j];
            }
            if(rowSum>largestOfRows){
                largestOfRows=rowSum;
                index=i;
            }
        }
        if(largestOfCols>largestOfRows){
            System.out.print("cols"+ " "+index+" ");
            return largestOfCols;
        }
        if(largestOfCols<largestOfRows){
            System.out.print("row"+" "+index+" ");
            return largestOfRows;
        }
        return Integer.MIN_VALUE;
    }
    public static void main(String[] args) {
        int input[][]=takeInput();
        int larColsOrRowSum=largestColsOrRowSum(input);
        System.out.println(larColsOrRowSum);
    }
}
