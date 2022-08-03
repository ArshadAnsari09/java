package stack.stackUsingLL;

import stack.StackUsingArray.StackEmptyException;

public class StackUse {
    public static void main(String[] args) throws StackEmptyException {
        StackUsingLL<Integer> stack=new StackUsingLL<>();
        int arr[]={4,6,2,7,9};
        for(int i=0;i<arr.length;i++){
            stack.push(arr[i]);
        }

        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
