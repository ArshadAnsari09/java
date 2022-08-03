package linkedList.llUsingRecursively;
import java.util.*;
public class PrintLL {

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
        printR(head);
    }
}
