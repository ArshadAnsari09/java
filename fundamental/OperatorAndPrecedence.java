package fundamental;


public class OperatorAndPrecedence{
    public static void main(String[] args) {
        int num1=10;
        int num2=4;
        int c=num1-num2;
        System.out.println(c);
        int remainder=10%3;
        System.out.println(remainder);
        int divisor=10/3;
        System.out.println(divisor);
        int precedence_1=3+2/5;
        System.out.println(precedence_1);
        int precedence_2=3*2/5;
        System.out.println(precedence_2);
        
        //write b/2a
        int precedence_same=num1/num2*2; //it is wrong because we expect 1 instead of getting 2
        precedence_same=num1/(num2*2);   //shows 1 which is write
        System.out.println(precedence_same);
    }
}