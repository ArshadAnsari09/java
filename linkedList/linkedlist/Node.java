package linkedList.linkedlist;

public class Node<T> {  //T -> generic
    public T data;
    public Node<T> next;
    public Node(T data){
        this.data=data;
        // next=null;  //default refernce
    }
}
