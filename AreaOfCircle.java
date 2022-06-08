package functions;
import java.util.Scanner;
public class AreaOfCircle {
    public static double areaOfCircle(double r){
     double area=3.14*r*r;
     return area;
    }
   public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       double r=s.nextDouble();
       double c=areaOfCircle(r);
       System.out.println(c); 
   }
}
