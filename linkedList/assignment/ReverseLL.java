package linkedList.assignment;
import java.util.*;
import linkedList.linkedlist.Node;
public class ReverseLL {

    public static void reverse(Node<Integer> root){
        if(root == null){
            return;
        }
        reverse(root.next);
        System.out.print(root.data+" ");
    }
    public static Node<Integer> takeInput(){
        Scanner s=new Scanner(System.in);
        int data=s.nextInt();

        Node<Integer> head=null , tail=null;

        while(data != -1){
            Node<Integer> temp=new Node<Integer> (data);
            if(head == null){
                head=temp;
                tail=temp;
            }else{
                tail.next=temp;
                tail=temp;   
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
        reverse(head);
    }
}
