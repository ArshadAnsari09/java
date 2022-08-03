package linkedList.llUsingRecursively;
import java.util.*;
public class DeletionNode {
    public static Node<Integer> delete(Node<Integer> head,int pos){
        if(head == null){
            return head;
        }
        if(pos == 0){
            return head.next;
        }
            
        Node<Integer> smallHead=delete(head.next, pos-1);
        head.next=smallHead;
        return head;

    }
    public static void printR(Node<Integer> head){
        if(head == null){
            return;
        }
        System.out.print(head.data + " ");
        printR(head.next);
    }

    public static Node<Integer> takeInput(){
        Scanner s=new Scanner(System.in);
        int data=s.nextInt();

        Node<Integer> head=null,tail=null;

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

    public static void main(String[] args) {
        Node<Integer> head=takeInput();
        System.out.print("Before Deleting: ");
        printR(head);
        System.out.println();
        head=delete(head,5);
        System.out.print("After deletion: ");
        printR(head);
    }
}
