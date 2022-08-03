package linkedList.linkedlist;
import java.util.*;
public class PrintIthNode {

    public static void find(Node<Integer> head ,int i){
        int count=0;
        Node<Integer> temp=head;
        while(temp!=null && count < i){
           temp=temp.next;
           count++;
        }
        if(temp != null){
            System.out.println(temp.data);
        }
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
        Scanner s=new Scanner(System.in);
        int i=s.nextInt();
        find(head,i);

    }
}
