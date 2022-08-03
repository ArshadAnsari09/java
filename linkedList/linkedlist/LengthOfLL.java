package linkedList.linkedlist;
import java.util.*;
public class LengthOfLL {

    public static int findLength(Node<Integer> head){
        int count=0;
        Node<Integer> temp=head;
        while(temp != null){
           count++;
           temp=temp.next;
        }
        return count;
    }
    public static Node<Integer> takeInput(){
        Scanner s=new Scanner(System.in);
        int data=s.nextInt();
        Node<Integer> head=null;
        while(data != -1){
            Node<Integer>  currentNode=new Node<Integer>(data);

            if(head == null){
                head=currentNode;
            }else{
                Node<Integer> tail=head;
                while(tail.next != null){
                    tail=tail.next;
                }

                tail.next=currentNode;
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
        int len=findLength(head);
        System.out.println(len);
    }
}
