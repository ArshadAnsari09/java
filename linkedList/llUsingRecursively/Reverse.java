package linkedList.llUsingRecursively;

import java.util.Scanner;

public class Reverse {
    public static Node<Integer> reverse(Node<Integer> head ){
        if(head == null || head.next == null){
            return head;
        }

        Node<Integer> smallHead=reverse(head.next);
        // Node<Integer> tail=smallHead;
        // while(tail.next != null){
        //     tail=tail.next;
        // }
        head.next.next=head;
        head.next=null;
        return smallHead;
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
        System.out.print("Before reversing: ");
        printR(head);
        System.out.println();
        head=reverse(head);
        System.out.print("After reversing: ");
        printR(head);
    }
}
