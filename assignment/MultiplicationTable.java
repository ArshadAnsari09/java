package assignment;
import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {
        int n,i,table;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        i=1;
        while(i<=10){
          table=n*i;
          System.out.println(table);
          i++;
        }
        System.out.println("Above Multiplication table is of " +n);
    }
}
