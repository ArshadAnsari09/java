package arrays2d.assignment;
import java.util.Scanner;
public class PrintLikeWave {
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

    public static void printLikeWave(int arr[][]){
        int rows=arr.length;
        int cols=arr[0].length;
        if(rows==0){
            return;
        }
        for(int j=0;j<cols;j++){
            if(j%2==0){
            for(int i=0;i<rows;i++){
                System.out.print(arr[i][j]+" ");
              
            }
        }else{
            for(int i=rows-1;i>=0;i--){
                System.out.print(arr[i][j]+" ");
            }
        }
            
        }
    }
    public static void main(String[] args) {
        int arr[][]=takeInput();
        printLikeWave(arr);
    }
}
