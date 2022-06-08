package assignment;
import java.util.Scanner;
public class Power {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        int n=s.nextInt();
        System.out.println("Value of x= "+x +"\t"+ "Value of n= "+n);
        int ans=1;
        while(n>0){
            ans=ans*x;
            n--; //n=> decreases
        }
        System.out.println("x^n ="+ans);
    }
}
