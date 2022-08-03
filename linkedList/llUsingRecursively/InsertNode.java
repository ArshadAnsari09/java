package linkedList.llUsingRecursively;
import java.util.*;
public class InsertNode {
    public static Node<Integer> insertNode(Node<Integer> head,int elem,int pos ){
        if(head == null && pos>0){
            return head;
        }
        if(pos == 0){
            Node<Integer> newHead=new Node<> (elem);
            newHead.next=head;
            return newHead;
        }else{
            head.next=insertNode(head.next,elem,pos-1);
            return head;
        }
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
        head=insertNode(head,20,0);
        printR(head);
    }
}
