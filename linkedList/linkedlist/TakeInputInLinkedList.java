package linkedList.linkedlist;
import java.util.Scanner;

public class TakeInputInLinkedList {
    public static Node<Integer> takeInput(){
        Scanner s=new Scanner(System.in);
        int data=s.nextInt();
        Node<Integer> head=null,tail=null;
        while(data != -1){
            Node<Integer>  currentNode=new Node<Integer>(data);

            if(head == null){
                head=currentNode;
                tail=currentNode;
            }else{
                // Node<Integer> tail=head;
                // while(tail.next != null){
                //     tail=tail.next;
                // }

                tail.next=currentNode;
                tail=currentNode;   //tail=tail.next;
            }
            data=s.nextInt();
        }
       return head;
    }

    public static void print(Node<Integer> head){
        Node<Integer> temp=head;
        while(temp != null){
           System.out.print(temp.data+" ");
           temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node<Integer> head=takeInput();
        print(head);
    }
}
