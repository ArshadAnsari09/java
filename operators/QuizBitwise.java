package operators;

public class QuizBitwise {
public static void main(String[] args) {
    int a=10,b=50;
    a++;
    --b;
    int c=a-- + b--;
    System.out.println(++c);
}    
}
