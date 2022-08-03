package stack;

import java.util.Stack;

public class StackCollection {
   public static void main(String[] args) {
       Stack<Integer> stack=new Stack<>();
       int arr[]={1,2,3,4,5};
       for(int elem : arr){
           stack.push(elem);
       }

       while(!stack.isEmpty()){
        System.out.println(stack.pop());
       }
    //    stack.push(50);
    //    System.out.println(stack.peek());
    //    System.out.println(stack.pop());
    //    System.out.println(stack.isEmpty());
   }
}
