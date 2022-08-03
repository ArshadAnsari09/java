package recursion.assignment;

public class Multiplication {
    public static int multiplyTwoIntegers(int m,int n){
        if(n==0 || m==0){
            return 0;
        }
        return m+multiplyTwoIntegers(m, n-1);
    }
    public static void main(String[] args) {
        int m=3;
        int n=4;
        int out=multiplyTwoIntegers(m,n);
        System.out.println(out);
    }
}
