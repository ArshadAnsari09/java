package fundamental;
// import java.util.Scanner;

public class DataTypeStore {
 public static void main(String[] args) {
     int min=Integer.MIN_VALUE;
     int max=Integer.MAX_VALUE;
     System.out.println(min + " " +max);
     char ch='a';
     System.out.println('a'+3); //'a'=97(ASCII) so 'a'+3=97+3=100
     int i='a'+3;
     System.out.println(i); // it also print 100 according to ascii value
     
 }   
}
