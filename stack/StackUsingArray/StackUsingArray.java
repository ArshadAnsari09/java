package stack.StackUsingArray;

public class StackUsingArray {
    
    private int data[];
    private int topIndex; 

    public StackUsingArray(){
        data=new int[2];
        topIndex=-1;
    }

    public StackUsingArray(int size){
        data=new int[size];
        topIndex=-1;
    }
    
    public int size(){
         return topIndex+1;
    }

    public boolean isEmpty(){
        // if(topIndex == -1){
        //     return false;
        // }else{
        //     return true;
        // }
        return topIndex == -1;
    }

    private void doubleCapacity(){
        System.out.println("Double Capacity");
        int temp[]= data;
        data= new int[2* temp.length];
        for(int i=0;i < temp.length; i++){
            data[i]=temp[i];
        }
    }

    public void push(int elem) throws StackFullException{
       //if stack is full then we throw an exception
          if(topIndex == data.length - 1 ){
            // StackFullException e= new StackFullException();
            // throw e;
            // throw new StackFullException();
            doubleCapacity();
         }  
        


       data[++topIndex]=elem;   //we should increase the index of element
    }

    public int top() throws StackEmptyException{
       if(topIndex == -1){
        //throw exception
        throw new StackEmptyException();

       }

       return data[topIndex];
    }

    public int pop() throws StackEmptyException{
        if(topIndex == -1){
            //throw exception
            throw new StackEmptyException();
    
           }

           int temp=data[topIndex];
           topIndex--;
           return temp;
    }

}
