package functions;

public class Void {
    public static void printEvenNumbers(int start, int end){
        for(int i=start; i<=end; i+=2){
            System.out.println(i);
        }
    }
    public static void printEvenNumber(){
        for(int i=3; i<=10; i++){
            if(i%2==0){
            System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        int start=10;
        int end=50;
        printEvenNumbers(start,end);
        printEvenNumber();
    }
}
