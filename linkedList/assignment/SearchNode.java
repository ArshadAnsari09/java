package linkedList.assignment;
import linkedList.linkedlist.Node;
import java.util.*;
public class SearchNode {
    public static int search(Node<Integer> head, int pos){
        if(head == null){
            return -1;
        }
        Node<Integer> temp=head;
        int index=0;
        while(temp != null){
            if(temp.data.equals(pos)){
               return index;
            }
            temp=temp.next;
            index++;
        }
        return -1;
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
        Scanner s=new Scanner(System.in);
        int pos=s.nextInt();
        int ans=search(head,pos);
        System.out.println(ans);
    }
}
