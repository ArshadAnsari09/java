package arrays2d;
import java.util.Scanner;
public class TakingInput {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the no. of rows");
        int rows=s.nextInt();
        System.out.println("Enter the no. of cols");
        int cols=s.nextInt();
        
        int arr[][]=new int[rows][cols];
        
        //taking an arrays input
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print("Enter the element at "+i+"rows "+j+" cols: ");
                arr[i][j]=s.nextInt();
            }
            
        }
         System.out.println();
        //printing an array
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
