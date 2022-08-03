package recursion2.assignment;
import java.util.Scanner;
public class TowerOfHanoi {
    public static void towerOfHanoi(int disks,char source,char auxiliary,char destination){
        if(disks==0){
            return;
        }
        towerOfHanoi(disks-1, source, destination, auxiliary);
        System.out.println((source+" "+destination));
        towerOfHanoi(disks-1, auxiliary, source, destination);
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("No. of Disks");
        int d=scan.nextInt();
        System.out.println("Source");
        char source='a';
        System.out.println("Auxiliary");
        char auxiliary='b';
        System.out.println("Destination");
        char destination='c';
        towerOfHanoi(d,source,auxiliary,destination);
    }
}
