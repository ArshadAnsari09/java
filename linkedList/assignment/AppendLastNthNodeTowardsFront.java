package linkedList.assignment;
import java.util.*;

import linkedList.linkedlist.Node;
public class AppendLastNthNodeTowardsFront {
    
    public static Node<Integer> appendLastNth(Node<Integer> head,int pos){
        if(head==null || pos==0){
            return head;
        }

        Node<Integer> fast=head;
        Node<Integer> slow=head;
        Node<Integer> initialHead=head;

        for(int i=0;i<pos;i++){
            fast=fast.next;
        }

        while(fast.next != null){
            slow=slow.next;
            fast=fast.next;
        }

        Node<Integer> temp=slow.next;
        slow.next=null;
        fast.next=initialHead;
        head=temp;
        return head;
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
        Node<Integer> append=appendLastNth(head,pos);
        print(append);
    }
}
