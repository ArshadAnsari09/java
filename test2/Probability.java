package test2;
import java.util.Scanner;
public class Probability {
    public static int ncr(int num){
        int fact=1;
        for(int i=1;i<=num; i++){
            fact=fact*i;
        }
        return fact;
    }
  
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        // int r=s.nextInt();
        int x=s.nextInt();
        int fact4=ncr(4);
        int factX=ncr(x);
        int fact4X=ncr(4-x);
        // int factNX=ncr(n-x);
        // int fact4NX=ncr(4-n+x);
        int redBall=fact4/(factX*fact4X);
        int otherBall=fact4/(factX*fact4X);
        if(x<=4 && x<=n){
        int probability=(redBall*otherBall*100)/8;
        System.out.println(probability);
        }
      
        
    }
}
