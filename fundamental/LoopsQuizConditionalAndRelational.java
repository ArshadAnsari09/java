package fundamental;

public class LoopsQuizConditionalAndRelational {
    public static void main(String[] args) {
        // int a=50;
        // int b=Integer.MIN_VALUE;
        // if(a/0==b){
        //     System.out.println("Hello");
        // }else{
        //     System.out.println("Hi");


        // }

        int a=50,b=20;
        if(a>b){
            if(a>100)
            System.out.println("Ace");
            if(b<10)
                b=50;
            
            
        }
        else if(a==b){
            System.out.println("King");
        }
        else{
         System.out.println("Queen");
        }
    }
}
