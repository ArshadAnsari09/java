package linkedList.linkedlist;
import java.util.*;
public class deleteNode {
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
                tail.next=currentNode;
                tail=currentNode;   
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

    public static Node<Integer> deleteNode(Node<Integer> head, int pos ){
        if(head == null){
            return head;
        }
        if(pos == 0){
            return head.next;
        
        }
        int count=0;
        
        Node<Integer> temp=head;
        while(temp != null && count < (pos-1)){
            temp=temp.next;
            count++;
        }

        if(temp == null || temp.next == null){
            return head;
        }
        temp.next=temp.next.next;

        return head;
    }

    public static void main(String[] args) {
        Node<Integer> head=takeInput();
        print(head);
        Scanner s=new Scanner(System.in);
        int pos=s.nextInt();
        Node<Integer> ans=deleteNode(head,pos);
        print(ans);
    }
}
