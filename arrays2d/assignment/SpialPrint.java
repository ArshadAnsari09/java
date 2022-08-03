package arrays2d.assignment;
import java.util.Scanner;
public class SpialPrint {
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

    public static void spiralPrint(int arr[][]){
        int nRows=arr.length;
        if(nRows==0){
            return;
        }

        int mCols=arr[0].length;
        int i,rowStart=0,colStart=0;
        int nElements=nRows*mCols;
        int count=0;

        while(count<nElements){
            for(i=colStart;count<nElements && i<mCols;i++){
                System.out.print(arr[rowStart][i]+" ");
                count++;
            }
            rowStart++;

            for(i=rowStart;count<nElements && i<nRows;i++){
                System.out.print(arr[i][mCols-1]+" ");
                count++;
            }
            mCols--;

            for(i=mCols-1;count<nElements && i>=colStart;i--){
                System.out.print(arr[nRows-1][i]+" ");
                count++;
            }
            nRows--;

            for(i=nRows-1;count<nElements && i>=rowStart;i--){
                System.out.print(arr[i][colStart]+" ");
                count++;
            }
            colStart++;
        }
    }
    public static void main(String[] args) {
        int arr[][]=takeInput();
        spiralPrint(arr);
    }
}
