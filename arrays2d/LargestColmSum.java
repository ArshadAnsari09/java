package arrays2d;
import java.util.Scanner;
public class LargestColmSum {
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
    public static int largestColSum(int[][] arr){
        int rows=arr.length;
        int cols=arr[0].length;
        int largest=Integer.MIN_VALUE;
        for(int j=0;j<cols;j++){
            int sum=0;
            for(int i=0;i<rows;i++){
                sum=sum+arr[i][j];
            }
            if(sum>largest){
                largest=sum;
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int input[][]=takeInput();
        int larColSum=largestColSum(input);
        System.out.println(larColSum);
    }
}
