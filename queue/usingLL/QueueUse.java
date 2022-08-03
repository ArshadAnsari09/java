package queue.usingLL;

import queue.QueueEmptyException;

public class QueueUse {
    public static void main(String[] args) throws QueueEmptyException {
        QueueUsingLL<Integer> queue=new QueueUsingLL<>();
        int arr[]={10,20,30,40,50};
        for(int elem : arr){
            queue.enqueue(elem);
        }
        
        while(! queue.isEmpty()){
            System.out.println(queue.dequeue());
        }
    }
}
