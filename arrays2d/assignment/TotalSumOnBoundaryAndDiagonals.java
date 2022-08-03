package arrays2d.assignment;
import java.util.Scanner;
public class TotalSumOnBoundaryAndDiagonals {
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
    private static int getFirstDiagonalSum(int arr[][],int dimension){
        int currRow=0;
        int currCol=0;
        int diagonalSum=0;
        while(currRow<dimension && currCol<dimension){
            diagonalSum+=arr[currRow][currCol];
            currRow++;
            currCol++;
        }
        return diagonalSum;
    }

    private static int getSecondDiagonalSum(int arr[][],int dimension){
        int currRow=0;
        int currCol=dimension-1;
        int diagonalSum=0;
        while(currRow<dimension && currCol>=0){
            diagonalSum+=arr[currRow][currCol];
            currRow++;
            currCol--;
        }
        return diagonalSum;
    }

    private static int getBoundarySum(int arr[][],int dimension){
        int sum=0;
        for(int i=1;i<(dimension-1);i++){
            sum+=arr[0][i];
            sum+=arr[dimension-1][i];
            sum+=arr[i][0];
            sum+=arr[i][dimension-1];
        }
        return sum;
    }

    public static void totalSum(int arr[][]){
       int n=arr.length;
       if(n==0){
           System.out.println(0);
           return ;
       }
       int totalSum=getFirstDiagonalSum(arr,n)+getSecondDiagonalSum(arr,n)+getBoundarySum(arr,n);

       if(n%2 !=0){
           totalSum-=arr[n/2][n/2];
       }
       System.out.println(totalSum);

    }
    public static void main(String[] args) {
        int arr[][]=takeInput();
        totalSum(arr);

    }
}
