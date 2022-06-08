package assignment;
import java.util.Scanner;
public class TotalSalrary {
    public static void main(String[] args) {
        int basic,allow;
        char grade;
        double hra,da,pf;
        Scanner s= new Scanner(System.in);
        basic=s.nextInt();
        grade=s.next().charAt(0);
        if(grade=='A'){
            allow=1700;
        }
        else if(grade=='B'){
            allow=1500;
        }
        else{
            allow=1300;
        }
        hra=(20*basic)/100;
        da=(50*basic)/100;
        pf=(11*basic)/100;

        double totalSalary=basic+hra+da+allow-pf;
        int ans=(int)Math.round(totalSalary);
        System.out.println(ans);
    }
}
