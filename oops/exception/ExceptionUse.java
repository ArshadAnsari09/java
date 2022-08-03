package oops.exception;

public class ExceptionUse {

    public static int fact(int n) throws NegativeNumberException{
        if(n < 0){
            throw new NegativeNumberException();
        }
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }
    public static int divide(int a,int b) throws DivideByZeroException{
        if(b == 0){
            // throw new ArithmeticException();
            throw new DivideByZeroException();
        }
        return a/b;
    }
    // public static void main(String[] args) throws DivideByZeroException{
    //     divide(10,0);
    //     System.out.println("Main"); //Not executed 
    // }

    public static void main(String[] args){
        try {
            divide(10,1);
            System.out.println(fact(-1));
            System.out.println("Main"); //Not executed 
        } catch (DivideByZeroException e) {
           System.out.println("Divide by Zero Exception raised");
        }catch (NegativeNumberException e){
            System.out.println("Negative Number Exception");
        }finally{
            System.out.println("Finally");
        }
        System.out.println("Main");  
    }
}
