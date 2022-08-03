package queue;

public class QueueUse {
    public static void main(String[] args) throws QueueEmptyException{
        QueueUsingArray queue= new QueueUsingArray(3);
        int arr[]={10,20,30,40,50};
        for(int elem : arr){
            queue.enqueue(elem);
        }
        
        while(! queue.isEmpty()){
            System.out.println(queue.dequeue());
        }
        
        // System.out.println(queue.isEmpty());
        // System.out.println(queue.size());
        // System.out.println(queue.front());
        // queue.enqueue(10);
        // System.out.println("Font element right now: " + queue.front());
        // queue.enqueue(4);
        // queue.enqueue(5);
        // queue.enqueue(6);
        // queue.enqueue(7);
        // System.out.println("Size of Queue currently: " + queue.size());
        // System.out.println("IsEmpty: " + queue.isEmpty());
        // System.out.println("Element is deleted at start : "+ queue.dequeue());
    }
}
