package fundamental;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        int n ,div=2;
        Scanner s = new Scanner(System.in);
        n=s.nextInt();
        // boolean isPrime=true;
        // while(div<=n-1){
        //     if(n%div==0){
        //         isPrime=false;
        //     }
        //     div=div+1;
        // }
        // if(isPrime==true){
        //     System.out.println("Prime");
        // }else{
        //     System.out.println("Composite");
        // }

        //or
        while(div<=n-1){
            if(n%div==0){
                System.out.println("Composite");
                return;
            }
            div=div+1;
        }
        System.out.println("Prime");


     
        
        // int i, num, count;
        // Scanner s = new Scanner(System.in);
        // num = s.nextInt();
        
        // count = 0;
        // for(i=1;i<=num;i++) {
        //     if (i%num == 0) 
        //     {
        //         count++;
        //     }
           
        // }

        // if (count == 2)
        //  {
        //     System.out.println("It is Prime Number");
        // } 
        // else {
        //     System.out.println("It is not a prime number");
        // }

    }
}
